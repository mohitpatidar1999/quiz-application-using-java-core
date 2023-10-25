
package simple.minds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Rules extends JFrame implements ActionListener {
   
    JLabel l1,l2;
    JButton b1,b2;
    String username;
    Rules(String username){
       
       
            this.username = username;
            setBounds(300,80,1000,550);
           try {
                    final Image backgroundImage = ImageIO.read(new File("C:\\Users\\Hp\\Desktop\\Simple Minds\\src\\simple\\minds\\icons\\rules.jpg"));
                    Image i2 = backgroundImage.getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
      
                    setContentPane(new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                    g.drawImage(i2, 0, 0, null);
                    }
                });
           } catch (IOException e) {
                throw new RuntimeException(e);
        }
         
           setLayout(null);
            
            l1 = new JLabel("Welcome "+username+" to Creative Minds");
            l1.setBounds(200,20,700,30);
            l1.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
            l1.setForeground(Color.YELLOW.brighter());
            add(l1);
            
            l2 = new JLabel("<html>"+"1. Game will start immidiately after pressing 'Play' Button."+
                    "<br><br>"+"2. You will be shown only one question at a time."+
                    "<br><br>"+"3. You can select only one option out of four."+
                    "<br><br>"+"4. Time limit is also set for every question that is 15 Seconds."+
                    "<br><br>"+"5. You can't skip any question, as time ups you will be taken to next question automatically."+
                    "<br><br>"+"6. You can go to next question by pressing 'Next' after selecting one option."+
                    "<br><br>"+"7. You have 50-50 Life Line."+
                    "<br><br>"+"8. You can't submit your answers before attemting all questions."+
            "<html>"
            );
            l2.setBounds(150, 5, 1000, 500);
            l2.setForeground(Color.WHITE);
            l2.setFont(new Font("Cambaria",Font.BOLD,17));
            add(l2);
            
            b1 = new JButton("Back");
            b1.setBounds(370,450,100,30);
            b1.setFont(new Font("Times New Roman",Font.BOLD, 16));
            b1.setBackground(Color.YELLOW);
            b1.setForeground(Color.BLACK);
            b1.addActionListener(this);
            add(b1);
            
            b2 = new JButton("Play");
            b2.setBounds(520,450,100,30);
            b2.setFont(new Font("Times New Roman",Font.BOLD, 16));
            b2.setBackground(Color.YELLOW);
            b2.setForeground(Color.BLACK);
            b2.addActionListener(this);
            add(b2);
           
            setVisible(true);
            
    }
     
public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==b1)
    {
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
        
    }
    else if(e.getSource()==b2){
        this.setVisible(false);
        new Quiz(username).setVisible(true);
        
    }
}

    public static void main(String []args){
        new Rules("");
    }
}
