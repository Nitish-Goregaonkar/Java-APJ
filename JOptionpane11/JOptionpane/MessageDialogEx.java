package JOptionpane;
//JOptionPane.showMessageDialog(parent,message,title,message_type);
//message types:
//1. JOptionPane.PLAIN_MESSAGE
//2. JOptionPane.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MessageDialogEx  {

        JFrame f;
        MessageDialogEx(){
            f=new JFrame();
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            JOptionPane.showMessageDialog(f,"Hello, Welcome to DBATU","plain",JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(f,"Do you want to close?","question",JOptionPane.QUESTION_MESSAGE);
//            JOptionPane.showMessageDialog(f,"This is MessageDialogBox Example","info",JOptionPane.INFORMATION_MESSAGE);
//            JOptionPane.showMessageDialog(f,"This is an error","error",JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(f,"This is a warning","warning",JOptionPane.WARNING_MESSAGE);

        }
        public static void main(String[] args) {
            new MessageDialogEx();
        }
    }
