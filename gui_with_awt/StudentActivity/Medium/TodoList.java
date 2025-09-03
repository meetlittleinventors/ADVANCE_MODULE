import javax.swing.*;
import java.awt.event.*;

public class TodoList {
    public static void main(String[] args) {
        JFrame f = new JFrame("To-Do List");

        JTextField taskField = new JTextField();
        taskField.setBounds(30, 30, 200, 30);

        JButton addBtn = new JButton("Add Task");
        addBtn.setBounds(250, 30, 100, 30);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scroll = new JScrollPane(taskList);
        scroll.setBounds(30, 80, 320, 150);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskField.setText("");
                }
            }
        });

        f.add(taskField); f.add(addBtn); f.add(scroll);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
