package LayoutManagers;
import java.awt.*;
import javax.swing.*;

class BoxLayoutEx extends JFrame{
    JButton b1,b2,b3,b4;
    BoxLayoutEx(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setBounds(100,100,600,500);
        setTitle("jframe");

        Container c1 = getContentPane();
        BoxLayout bl = new BoxLayout(c1,BoxLayout.Y_AXIS);
        c1.setLayout(bl);

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");

       b1.setAlignmentX(c1.CENTER_ALIGNMENT);
       b2.setAlignmentX(c1.CENTER_ALIGNMENT);
       b3.setAlignmentX(c1.CENTER_ALIGNMENT);
       b4.setAlignmentX(c1.CENTER_ALIGNMENT);
       c1.add(b1);
       c1.add(Box.createRigidArea(new Dimension(0,15)));
      //c1.add(Box.createRigidArea(new Dimension(50,0)));
       c1.add(b2);
       c1.add(Box.createRigidArea(new Dimension(0,15)));
       c1.add(b3);
       c1.add(Box.createRigidArea(new Dimension(0,15)));
        c1.add(b4);

    }
    public static void main (String[]args){
      BoxLayoutEx ch = new BoxLayoutEx();
    }
}
