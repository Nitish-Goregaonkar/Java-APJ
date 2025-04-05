package JOptionpane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConfirmDialogEx extends JFrame implements ActionListener {
    JFrame f;
    ConfirmDialogEx() {
        f=new JFrame();
        f.setVisible(true);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        JButton jb=new JButton("Click Here");
        f.add(jb);

        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int sel= JOptionPane.showConfirmDialog(f,"Do You Want to exit?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (sel==JOptionPane.YES_OPTION){
            System.out.println("Yes option is selected");
        }
        else
        if (sel==JOptionPane.NO_OPTION){
            System.out.println("No option is selected");
        }
        else
        if (sel==JOptionPane.CANCEL_OPTION){
            System.out.println("Yes option is selected");
        }
    }

    public static void main(String[] args) {
        ConfirmDialogEx c=new ConfirmDialogEx();
    }
}

