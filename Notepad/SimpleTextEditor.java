package Notepad;
import javax.swing.*;
public class SimpleTextEditor {
    JFrame frame;
    JTextArea jTextArea;
    JMenuBar jMenuBar;
    JMenu File,Edit,Close; // for menu bar option
    JMenuItem NewFile, OpenFile, SaveFile, PrintFile; //For File Option

    JMenuItem Cut, Copy, Paste; // For Edit option

    JMenuItem CloseIt; // for close option


    SimpleTextEditor(){
        frame=new JFrame("Simple Text Editor");
        jTextArea=new JTextArea("Welcome to the Editor");
        frame.add(jTextArea);

        jMenuBar=new JMenuBar();
        File =new JMenu("File");
        Edit =new JMenu("Edit");
        Close = new JMenu("Close");

        jMenuBar.add(File);
        jMenuBar.add(Edit);
        jMenuBar.add(Close);

        // for file option
        NewFile=new JMenuItem("New File");
        OpenFile=new JMenuItem("Open");
        SaveFile=new JMenuItem("Save");
        PrintFile=new JMenuItem("Print");

        File.add(NewFile);
        File.add(OpenFile);
        File.add(SaveFile);
        File.add(PrintFile);

        // for edit option

        Cut=new JMenuItem("Cut");
        Copy=new JMenuItem("Copy");
        Paste=new JMenuItem("Paste");

        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);

        // for close button

        CloseIt = new JMenuItem("Close Editor");

        Close.add(CloseIt);


        frame.setJMenuBar(jMenuBar);

        frame.setBounds(0,0,800,1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // this line means whenever we just click on the close button of the window then this program terminate automatically
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SimpleTextEditor editor=new SimpleTextEditor();
    }
}
