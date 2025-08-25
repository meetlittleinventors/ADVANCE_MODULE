import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MiniNotepad {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mini Notepad");
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(0, 0, 500, 400);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(newFile); file.add(openFile); file.add(saveFile); file.add(exit);
        mb.add(file);

        f.setJMenuBar(mb);
        f.add(sp);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // New
        newFile.addActionListener(e -> ta.setText(""));

        // Open
        openFile.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(f) == JFileChooser.APPROVE_OPTION) {
                File fileToOpen = fc.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(fileToOpen))) {
                    ta.read(br, null);
                } catch (IOException ex) { ex.printStackTrace(); }
            }
        });

        // Save
        saveFile.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            if (fc.showSaveDialog(f) == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fc.getSelectedFile();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileToSave))) {
                    ta.write(bw);
                } catch (IOException ex) { ex.printStackTrace(); }
            }
        });

        // Exit
        exit.addActionListener(e -> System.exit(0));
    }
}
