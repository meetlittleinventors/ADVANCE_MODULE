import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem extends Application {

    private ObservableList<Book> bookList = FXCollections.observableArrayList();
    private ObservableList<Member> memberList = FXCollections.observableArrayList();

    private List<IssuedBook> issuedBooks = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System");

        // UI Controls
        TextField bookField = new TextField();
        bookField.setPromptText("Book Title");

        TextField memberField = new TextField();
        memberField.setPromptText("Member Name");

        Button addBookBtn = new Button("Add Book");
        Button addMemberBtn = new Button("Add Member");
        Button issueBtn = new Button("Issue Book");
        Button returnBtn = new Button("Return Book");

        ListView<String> listView = new ListView<>();
        updateListView(listView);

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        grid.add(bookField, 0, 0);
        grid.add(addBookBtn, 1, 0);
        grid.add(memberField, 0, 1);
        grid.add(addMemberBtn, 1, 1);
        grid.add(issueBtn, 0, 2);
        grid.add(returnBtn, 1, 2);
        grid.add(listView, 0, 3, 2, 1);

        // Button Actions
        addBookBtn.setOnAction(e -> {
            String title = bookField.getText();
            if (!title.isEmpty()) {
                bookList.add(new Book(title));
                bookField.clear();
                updateListView(listView);
            }
        });

        addMemberBtn.setOnAction(e -> {
            String name = memberField.getText();
            if (!name.isEmpty()) {
                memberList.add(new Member(name));
                memberField.clear();
                updateListView(listView);
            }
        });

        issueBtn.setOnAction(e -> {
            if (!bookList.isEmpty() && !memberList.isEmpty()) {
                Book book = bookList.get(0); // issue first book for demo
                Member member = memberList.get(0); // first member
                issuedBooks.add(new IssuedBook(book, member, LocalDate.now()));
                bookList.remove(book);
                updateListView(listView);
                showAlert("Book Issued", book.getTitle() + " issued to " + member.getName());
            }
        });

        returnBtn.setOnAction(e -> {
            if (!issuedBooks.isEmpty()) {
                IssuedBook issued = issuedBooks.remove(0); // return first issued book
                bookList.add(issued.getBook());
                updateListView(listView);
                showAlert("Book Returned", issued.getBook().getTitle() + " returned by " + issued.getMember().getName());
            }
        });

        // Start background thread for overdue notification
        Thread notificationThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000); // check every 5 seconds
                    for (IssuedBook ib : issuedBooks) {
                        long days = ChronoUnit.DAYS.between(ib.getIssueDate(), LocalDate.now());
                        if (days > 7) { // overdue > 7 days
                            Platform.runLater(() -> showAlert("Overdue Book", ib.getBook().getTitle() +
                                    " is overdue! Issued to " + ib.getMember().getName()));
                        }
                    }
                } catch (InterruptedException ignored) {}
            }
        });
        notificationThread.setDaemon(true);
        notificationThread.start();

        primaryStage.setScene(new Scene(grid, 400, 400));
        primaryStage.show();
    }

    private void updateListView(ListView<String> lv) {
        lv.getItems().clear();
        for (Book b : bookList) lv.getItems().add("Book: " + b.getTitle());
        for (Member m : memberList) lv.getItems().add("Member: " + m.getName());
        for (IssuedBook ib : issuedBooks) lv.getItems().add("Issued: " + ib.getBook().getTitle() + " -> " + ib.getMember().getName());
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }

    // Classes
    class Book {
        private String title;
        public Book(String title) { this.title = title; }
        public String getTitle() { return title; }
    }

    class Member {
        private String name;
        public Member(String name) { this.name = name; }
        public String getName() { return name; }
    }

    class IssuedBook {
        private Book book;
        private Member member;
        private LocalDate issueDate;
        public IssuedBook(Book book, Member member, LocalDate date) {
            this.book = book;
            this.member = member;
            this.issueDate = date;
        }
        public Book getBook() { return book; }
        public Member getMember() { return member; }
        public LocalDate getIssueDate() { return issueDate; }
    }
}
