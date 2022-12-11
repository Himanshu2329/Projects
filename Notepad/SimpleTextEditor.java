package Notepad;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.beans.PropertyChangeListener;

import javax.management.RuntimeErrorException;
import javax.swing.*;
public class SimpleTextEditor implements Action{
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
        NewFile.addActionListener(this);
        OpenFile=new JMenuItem("Open");
        OpenFile.addActionListener(this);
        SaveFile=new JMenuItem("Save");
        SaveFile.addActionListener(this);
        PrintFile=new JMenuItem("Print");
        PrintFile.addActionListener(this);

        File.add(NewFile);
        File.add(OpenFile);
        File.add(SaveFile);
        File.add(PrintFile);

        // for edit option

        Cut=new JMenuItem("Cut");
        Cut.addActionListener(this);
        Copy=new JMenuItem("Copy");
        Copy.addActionListener(this);
        Paste=new JMenuItem("Paste");
        Paste.addActionListener(this);

        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);

        // for close button

        CloseIt = new JMenuItem("Close Editor");
        CloseIt.addActionListener(this);

        Close.add(CloseIt);


        frame.setJMenuBar(jMenuBar);

        frame.setBounds(0,0,800,1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // this line means whenever we just click on the close button of the window then this program terminate automatically
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SimpleTextEditor editor=new SimpleTextEditor();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String s=e.getActionCommand();

        if(s.equals("Cut")){
            jTextArea.cut();
        }else if(s.equals("Copy")){
            jTextArea.copy();
            
        }
        else if(s.equals("Paste")){
            jTextArea.paste();
        }
        else if(s.equals("Print")){
            try {
                jTextArea.print();
            } catch (PrinterException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        else if(s.equals("New File")){
            jTextArea.setText("");
        }
        else if(s.equals("Close Editor")){
            // frame.setVisible(false); 
            //  or
            System.exit(0);
        }


        
    }
    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
}
