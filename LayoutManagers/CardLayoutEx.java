package LayoutManagers;

import java.awt.*; 
import javax.swing.*; 
public class CardLayoutEx extends JFrame{    
CardLayoutEx(){ 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setBounds(100,100,700,600); 
Container c = getContentPane(); 
CardLayout cardLayout = new CardLayout(); 
c.setLayout(cardLayout); 
 JButton b1 = new JButton("Button 1"); 
 JButton b2 = new JButton("Button 2"); 
 JButton b3 = new JButton("Button 3"); 
 JButton b4 = new JButton("Button 4"); 
 c.add(b1,"1");   c.add(b2,"2"); c.add(b3,"3"); c.add(b4,"4"); 
    } 
    public static void main(String[] args) { 
        CardLayoutEx cardLayoutEx = new CardLayoutEx(); 
} 
}