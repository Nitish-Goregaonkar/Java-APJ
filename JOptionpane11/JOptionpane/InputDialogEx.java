package JOptionpane;

// JOptionPane used to show an input Dialog
// show Message Dialog
// show confirm dialog

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example to show input dialog
//str=JOptionPane.showInputDialog("Enter your name");
public class InputDialogEx extends JFrame implements ActionListener {
    InputDialogEx(){
        setVisible(true);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout f=new FlowLayout();
        setLayout(f);

        JButton b1=new JButton("Click Here");
        add(b1);

        //add action listener to button b1
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        String str=JOptionPane.showInputDialog("Enter your name");
        if (str.length()>0){
            System.out.println("The name of user is "+str);
        }
    }

    public static void main(String[] args) {
        InputDialogEx j=new InputDialogEx();
    }

}
