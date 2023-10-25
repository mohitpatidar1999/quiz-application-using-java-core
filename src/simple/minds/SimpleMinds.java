
package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.*;

public class SimpleMinds extends JFrame implements ActionListener{


    JButton b1,b2;
    JTextField t1;
    SimpleMinds(){
            setBounds(300,80,1000,500);
            setLayout(null);
            
            JPanel jp = new JPanel();
            jp.setBackground(Color.YELLOW);
            jp.setBounds(600,0,400,500);
            jp.setOpaque(true);
            jp.setLayout(null);
            
            JLabel l2 = new JLabel("Creative Minds");
            l2.setBounds(50,70,300,50);
            l2.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
            l2.setForeground(Color.BLACK);
            jp.add(l2);
       
            JLabel l3 = new JLabel("Enter Your Name");
            l3.setBounds(70,180,300,20);
            l3.setFont(new Font("Comic Sans MS",Font.BOLD, 18));
            l3.setForeground(Color.BLACK);
            jp.add(l3);
            
            t1 = new JTextField();
            t1.setBounds(70, 215, 220, 25);
            t1.setFont(new Font("Times New Roman",Font.BOLD, 20));
            jp.add(t1);
            
            b1 = new JButton("Rules");
            b1.setBounds(70,280,100,30);
            b1.setFont(new Font("Times New Roman",Font.BOLD, 16));
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            jp.add(b1);
            
            b2 = new JButton("Exit");
            b2.setBounds(200,280,100,30);
            b2.setFont(new Font("Times New Roman",Font.BOLD, 16));
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            jp.add(b2);
            
            add(jp);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/front.jpg"));
            Image i2 = i1.getImage().getScaledInstance(650, 500, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l1 = new JLabel(i3);
            l1.setBounds(0,0, 650, 500);
            add(l1);
            
            
            
            setVisible(true);
        }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
         
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }
        else{
            System.exit(0);
        }
         
    }
    public static void main(String[] args) {
        
        new SimpleMinds();
    }
    
}
