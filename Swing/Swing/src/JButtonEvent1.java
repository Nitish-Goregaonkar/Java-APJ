import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JButtonEvent1 extends JFrame implements ActionListener {
    Container c;
    JButton jb, jb2;
    JButtonEvent1(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        jb=new JButton("Click Here");
        jb.setBounds(100,100,100,30);
        c.add(jb);
        jb.addActionListener(this);
        jb2 =new JButton("Click Here");
        jb2 .setBounds(100,200,100,30);
        c.add(jb2 );

    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.BLUE);
    }
    public static void main(String[] args) {
        JButtonEvent1 be=new JButtonEvent1();
    }
}
