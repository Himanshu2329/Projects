package Notepad;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * FirstSession
 */
public class FirstSession {
    static JFrame frame;
    static JTextArea textArea;

    static JTextField textField;

    static JButton jButton;

    static JMenuBar jMenuBar;
    static JMenu jMenu;
    static JMenuItem jMenuItem, jMenuItem2;

    public static void main(String[] args) {
        frame = new JFrame("First Session");
        frame.setLayout(null); // isne sbse phele to pura size zero krdiya frame ka
        frame.setBounds(200, 100, 400, 400); // fir isne hmare according size de diya frame ko

        textArea = new JTextArea("First TextArea");
        textArea.setBounds(30, 30, 300, 300);

        textField = new JTextField("First textField");

        jButton = new JButton("Click me");
        jButton.setBounds(250, 350, 100, 100);
        jButton.setVisible(true);

        jMenuBar=new JMenuBar();
        jMenu=new JMenu("open");
        jMenuItem=new JMenuItem("first option");
        jMenuItem2=new JMenuItem("Second option");

        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem2);
        jMenuBar.add(jMenu);

        frame.setJMenuBar(jMenuBar);    


        textArea.add(textField);
        textArea.add(jButton);

        frame.add(jButton);
        frame.add(textArea);

        frame.setVisible(true);

    }
}