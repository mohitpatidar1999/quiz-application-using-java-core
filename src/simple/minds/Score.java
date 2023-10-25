
package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    JButton b1,b2;
    Score(String username, int score){
        
            setBounds(300,200,900,550);
            getContentPane().setBackground(Color.BLACK);
            setLayout(null);
        
            
           JLabel l2 = new JLabel("Thank You "+username+" for playing");
           l2.setBounds(100,45,1100,60);
           l2.setFont(new Font("Cambria",Font.BOLD,55));
           l2.setForeground(new Color(255,0,0));
           add(l2);
           
           JLabel l21 = new JLabel("Creative Minds");
           l21.setBounds(250,120,500,56);
           l21.setFont(new Font("Cambria",Font.BOLD,50));
           l21.setForeground(new Color(255,0,0));
           add(l21);
           JLabel l3 = new JLabel("Your Score : "+score);
           l3.setBounds(300,220,300,50);
           l3.setFont(new Font("Cambria",Font.BOLD,40));
           l3.setForeground(Color.WHITE);
           add(l3);
           
           if(score == 0){
           
               JLabel l4 = new JLabel("Oops! Better Luck Next Time");
               l4.setBounds(230, 285, 500, 50);
               l4.setForeground(new Color(0,0,255));
           l4.setFont(new Font("Cambria",Font.ROMAN_BASELINE,30));
               add(l4);
           }else if(score == 100){
               
               JLabel l4 = new JLabel("Yayy! You won the Game");
               l4.setBounds(230, 285, 500, 50);
               l4.setFont(new Font("Cambria",Font.PLAIN,30));
               add(l4);
           }
           
           b1 = new JButton("Play Again");
           b1.setBounds(220,400,200,30);
           b1.setForeground(Color.WHITE);
           b1.setBackground(new Color(255,0,0));
           b1.setFont(new Font("Cambria",Font.BOLD,20));
           b1.addActionListener(this);
           add(b1);
           
           b2 = new JButton("Exit");
           b2.setBounds(450,400,200,30);
           b2.setForeground(Color.WHITE);
           b2.setBackground(new Color(255,0,0));
           b2.setFont(new Font("Cambria",Font.BOLD,20));
           b2.addActionListener(this);
           add(b2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }
        else{
            System.exit(0);
        }
    }
    public static void main(String []args){
        new Score("",0).setVisible(true);
    }
}
