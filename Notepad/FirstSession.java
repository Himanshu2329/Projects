package Notepad;

import javax.swing.JButton;
import javax.swing.JFrame;
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
    public static void main(String[] args) {
        frame=new JFrame("First Session");
        frame.setLayout(null); // isne sbse phele to pura size zero krdiya frame ka 
        frame.setBounds(200,100,400,400); // fir isne hmare according size de diya frame ko

        textArea=new JTextArea("First TextArea");
        textArea.setBounds(300,300,50,50);

        textField=new JTextField("First textField");

        jButton=new JButton("Click me");
        jButton.setBounds(250,350,100,100);
        jButton.setVisible(true);


        textArea.add(textField);
        textArea.add(jButton);

        frame.add(jButton);
        frame.add(textArea);

        frame.setVisible(true);
        

    }
}