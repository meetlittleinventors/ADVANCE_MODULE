import javax.swing.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(140, 30, 150, 30);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 70, 100, 30);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(140, 70, 80, 30);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(220, 70, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male); bg.add(female);

        JCheckBox cb1 = new JCheckBox("Sports");
        cb1.setBounds(30, 110, 100, 30);
        JCheckBox cb2 = new JCheckBox("Music");
        cb2.setBounds(140, 110, 100, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(100, 160, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(30, 200, 300, 30);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
                String hobbies = "";
                if (cb1.isSelected()) hobbies += "Sports ";
                if (cb2.isSelected()) hobbies += "Music ";

                result.setText("Name: " + name + ", Gender: " + gender + ", Hobbies: " + hobbies);
            }
        });

        f.add(nameLabel); f.add(nameField);
        f.add(genderLabel); f.add(male); f.add(female);
        f.add(cb1); f.add(cb2);
        f.add(submit); f.add(result);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
