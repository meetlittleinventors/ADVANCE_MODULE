import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;

public class StudentManagementSystem extends Application {

    private TableView<Student> table = new TableView<>();
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    // JDBC variables
    private final String URL = "jdbc:mysql://localhost:3306/school";
    private final String USER = "root";
    private final String PASSWORD = "password";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Management System");

        // UI Controls
        TextField idField = new TextField();
        idField.setPromptText("ID");
        TextField nameField = new TextField();
        nameField.setPromptText("Name");
        TextField ageField = new TextField();
        ageField.setPromptText("Age");
        TextField gradeField = new TextField();
        gradeField.setPromptText("Grade");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        Button addBtn = new Button("Add");
        Button updateBtn = new Button("Update");
        Button deleteBtn = new Button("Delete");
        Button searchBtn = new Button("Search");

        // TableView setup
        TableColumn<Student, Integer> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());

        TableColumn<Student, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        TableColumn<Student, Integer> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(cellData -> cellData.getValue().ageProperty().asObject());

        TableColumn<Student, String> gradeCol = new TableColumn<>("Grade");
        gradeCol.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());

        TableColumn<Student, String> emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(cellData -> cellData.getValue().emailProperty());

        table.getColumns().addAll(idCol, nameCol, ageCol, gradeCol, emailCol);
        table.setItems(studentList);

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(5);
        grid.setHgap(5);

        grid.add(idField, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(ageField, 2, 0);
        grid.add(gradeField, 3, 0);
        grid.add(emailField, 4, 0);
        grid.add(addBtn, 0, 1);
        grid.add(updateBtn, 1, 1);
        grid.add(deleteBtn, 2, 1);
        grid.add(searchBtn, 3, 1);
        grid.add(table, 0, 2, 5, 1);

        // Load initial data
        loadStudentsFromDB();

        // Button actions
        addBtn.setOnAction(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String grade = gradeField.getText();
                String email = emailField.getText();
                Student s = new Student(id, name, age, grade, email);
                addStudentToDB(s);
                studentList.add(s);
            } catch (Exception ex) {
                showAlert("Error", ex.getMessage());
            }
        });

        updateBtn.setOnAction(e -> {
            Student selected = table.getSelectionModel().getSelectedItem();
            if (selected != null) {
                try {
                    selected.setName(nameField.getText());
                    selected.setAge(Integer.parseInt(ageField.getText()));
                    selected.setGrade(gradeField.getText());
                    selected.setEmail(emailField.getText());
                    updateStudentInDB(selected);
                    table.refresh();
                } catch (Exception ex) {
                    showAlert("Error", ex.getMessage());
                }
            }
        });

        deleteBtn.setOnAction(e -> {
            Student selected = table.getSelectionModel().getSelectedItem();
            if (selected != null) {
                deleteStudentFromDB(selected);
                studentList.remove(selected);
            }
        });

        searchBtn.setOnAction(e -> {
            try {
                int searchId = Integer.parseInt(idField.getText());
                Student result = searchStudentInDB(searchId);
                if (result != null) {
                    showAlert("Student Found", result.toString());
                } else {
                    showAlert("Not Found", "No student with ID " + searchId);
                }
            } catch (Exception ex) {
                showAlert("Error", ex.getMessage());
            }
        });

        primaryStage.setScene(new Scene(grid, 800, 400));
        primaryStage.show();
    }

    // JDBC Methods
    private void loadStudentsFromDB() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("grade"),
                        rs.getString("email")
                );
                studentList.add(s);
            }
        } catch (SQLException e) {
            showAlert("DB Error", e.getMessage());
        }
    }

    private void addStudentToDB(Student s) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES(?,?,?,?,?)")) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getGrade());
            ps.setString(5, s.getEmail());
            ps.executeUpdate();
        }
    }

    private void updateStudentInDB(Student s) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(
                     "UPDATE students SET name=?, age=?, grade=?, email=? WHERE id=?")) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getGrade());
            ps.setString(4, s.getEmail());
            ps.setInt(5, s.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            showAlert("DB Error", e.getMessage());
        }
    }

    private void deleteStudentFromDB(Student s) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id=?")) {
            ps.setInt(1, s.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            showAlert("DB Error", e.getMessage());
        }
    }

    private Student searchStudentInDB(int id) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id=?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("grade"),
                        rs.getString("email")
                );
            }
        } catch (SQLException e) {
            showAlert("DB Error", e.getMessage());
        }
        return null;
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
