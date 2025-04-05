import java.awt.*;
import javax.swing.*;

public class JLabelExample extends JFrame {
    JLabelExample() {
        setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 600, 500);
       // setTitle("Introduction to Jframe");

        java.awt.Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);


        JLabel l1 = new JLabel("HBD");
        l1.setBounds(100, 50, 200, 30);

        Font f=new Font("Arial",Font.BOLD,30);
        l1.setFont(f);

        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.BLACK);
        c.add(l1);


    }



  

    




    public static void main(String[] args) {
     JLabelExample J = new JLabelExample();
    }
}

