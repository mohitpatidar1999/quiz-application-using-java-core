
package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Quiz extends JFrame implements ActionListener{
    
    JButton next,submit,lifeline;
    JLabel question,qno;
    String q[][] = new String[10][5];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    public static int count=0;
    public static int timer=15;
    public static int score=0;
    int ans_given=0;
    String username;
        
    Quiz(String username){
        
        this.username = username;
        setBounds(260,60,1100,750);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        

        ImageIcon i1 =new ImageIcon("C:\\Users\\Hp\\Desktop\\Simple Minds\\src\\simple\\minds\\icons\\quiz1.jpeg");
        Image i2 = i1.getImage().getScaledInstance(1100, 365, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l1 = new JLabel(i3);
            l1.setBounds(0,0, 1100, 365);
            add(l1);
        
        /*        String path = "C:\\Users\\Hp\\Desktop\\Simple Minds\\src\\simple\\minds\\icons\\quiz.jpeg";
        File file = new File(path);
        BufferedImage image = null;
        try{image = ImageIO.read(file);}
        catch(IOException e){}
        
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(0,0,1100,365);
        add(label);*/
 
        q[0][0] = "Which is used to find and fix bugs in the Java programs?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "long";
        q[1][2] = "Object";
        q[1][3] = "int";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma",Font.PLAIN,20));
        qno.setBounds(100, 410, 50, 50);
        qno.setForeground(Color.WHITE);
        add(qno);
        
        question = new JLabel("");
        question.setBounds(130, 410, 1000, 50);
        question.setFont(new Font("Tahoma",Font.PLAIN,20));
        question.setForeground(Color.WHITE);
        add(question);
        
        opt1 = new JRadioButton("");
        opt1.setBounds(130, 490, 500, 30);
        opt1.setForeground(Color.WHITE);
        opt1.setBackground(Color.BLACK);
        opt1.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(130, 530, 500, 30);
        opt2.setForeground(Color.WHITE);
        opt2.setBackground(Color.BLACK);
        opt2.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(130, 570, 500, 30);
        opt3.setForeground(Color.WHITE);
        opt3.setBackground(Color.BLACK);
        opt3.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(130, 610, 500, 30);
        opt4.setForeground(Color.WHITE);
        opt4.setBackground(Color.BLACK);
        opt4.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Cambaria",Font.PLAIN,16));
        next.setBounds(770,480,150,30);
        next.setForeground(Color.BLACK);
        next.setBackground(Color.YELLOW);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50:50");
        lifeline.setFont(new Font("Cambaria",Font.PLAIN,16));
        lifeline.setBounds(770,540,150,30);
        lifeline.setBackground(Color.YELLOW);
        lifeline.setForeground(Color.BLACK);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Cambaria",Font.PLAIN,16));
        submit.setBounds(770,600,150,30);
        submit.setEnabled(false);
        submit.setBackground(Color.YELLOW);
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        add(submit);
        
        
        start(count);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==next){
            
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given=1;
           
             if(options.getSelection()==null){
                
                pa[count][0]="";
            }
            else{
                
                pa[count][0] = options.getSelection().getActionCommand();
            }
           
            if(count==8){
                        next.setEnabled( false );
                        submit.setEnabled(true);
                     }
            
            count++;
            start(count);
        }
        else if(e.getSource()==lifeline){
            
            if(count==2||count==4||count==6||count==8||count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
        else if(e.getSource()==submit){
            
           
            ans_given=1;
             if(options.getSelection()==null){
                   pa[count][0]="";
                 }
             else{
                   pa[count][0] = options.getSelection().getActionCommand();
                 }
             for(int i=0;i<pa.length;i++){
                     if(pa[i][0].equals(qa[i][1])){
                            score+=10;
                          }
                   }
             this.setVisible(false);
             new Score(username,score).setVisible(true);
              count=0;
              score=0;
        }
    }
    
    public void paint(Graphics g){
        
     
        super.paint(g);
        String time="Time Left  "+ timer;
        //System.out.println("hello");
        
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        
        if(timer>0){
        
            g.drawString(time,770, 450);
        }
        else{
            g.drawString("Times Up!",770,450);   
        }
        timer--;
        try {
               Thread.sleep(1000);
                repaint();
        }catch(Exception e){ e.printStackTrace();}
        if(ans_given == 1){
            ans_given = 0;
            timer=15;
        }
        else if(timer<0){
            
                timer=15;
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                opt4.setEnabled(true);
                     if(count==8){
                        next.setEnabled( false );
                        submit.setEnabled(true);
                     }
                    if(count==9){
                        if(options.getSelection()==null){
                                    pa[count][0]="";
                        }
                        else{
                        pa[count][0] = options.getSelection().getActionCommand();
                        }
                        
                        for(int i=0;i<pa.length;i++){
                             if(pa[i][0].equals(qa[i][1])){
                                 score+=10;
                             }
                        }
                        this.setVisible(false);
                        new Score(username,score).setVisible(true);
                        }
                     else{
                            if(options.getSelection()==null){
                                pa[count][0]="";
                            }
                            else{
                                pa[count][0] = options.getSelection().getActionCommand();
                            }
                        count++;
                        start(count);
                    }
            }
    }
    public void start(int count){
        
        qno.setText(""+(count+1)+". ");
        question.setText(q[count][0]);
        opt1.setText(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setText(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setText(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setText(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
        
        
    }
    public static void main(String []args){
        
        new Quiz("").setVisible(true);
        
    }
}
