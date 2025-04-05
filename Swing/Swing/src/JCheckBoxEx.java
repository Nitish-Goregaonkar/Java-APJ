import java.awt.*;
import javax.swing.*;
public class JCheckBoxEx extends JFrame{
    JCheckBoxEx(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JCheckBox c1=new JCheckBox("10th");
        JCheckBox c2=new JCheckBox("12th");
        JCheckBox c3=new JCheckBox("Diploma");
        JCheckBox c4=new JCheckBox("Degree");

        c1.setBounds(100,50,200,20);
        c2.setBounds(100,100,200,20);
        c3.setBounds(100,150,200,20);
        c4.setBounds(100,200,200,20);

        c.add(c1);c.add(c2);c.add(c3);c.add(c4);

        //Change the font
//        Font f=new Font("Times New Roman",Font.ITALIC,20);
//        c1.setFont(f);c2.setFont(f);c3.setFont(f);c4.setFont(f);

        //setselected method to select option bydefault
//        c2.setSelected(true);

        //to disable the option
//        c4.setEnabled(false);

    }

    public static void main(String[] args) {
        JCheckBoxEx j=new JCheckBoxEx();
    }
}
