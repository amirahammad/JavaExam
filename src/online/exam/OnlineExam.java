
package online.exam;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;


public class OnlineExam extends JFrame implements ActionListener{
    
    JLabel l;  
    JRadioButton jRadioButton[]=new JRadioButton[5];  
    JButton nextButton,bookmarkButton;  
    ButtonGroup buttonGroup;  
    int counter=0,currentFrame=0,x=1,y=1,now=0;  
    int frame[]=new int[10];      
    OnlineExam(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
       buttonGroup =new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jRadioButton[i]=new JRadioButton();     
            add(jRadioButton[i]);  
            buttonGroup.add(jRadioButton[i]);  
        }  
        set();
        nextButton=new JButton("Next");  
        bookmarkButton=new JButton("Bookmark");  
        nextButton.addActionListener(this);  
        bookmarkButton.addActionListener(this);  
        add(nextButton);
        add(bookmarkButton);    
        l.setBounds(30,40,450,20);  
        jRadioButton[0].setBounds(50,80,100,20);  
        jRadioButton[1].setBounds(50,110,100,20);  
        jRadioButton[2].setBounds(50,140,100,20);  
        jRadioButton[3].setBounds(50,170,100,20);  
        nextButton.setBounds(100,240,100,30);  
        bookmarkButton.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100); 
        setBackground(Color.red); 
        setVisible(true);  
        setSize(600,350); 
      
    }
    public void set(){
        if(currentFrame==0){
            l.setText("Que1: Which one among these is not a primitive datatype?");
            jRadioButton[0].setText("int");
            jRadioButton[1].setText("float");
            jRadioButton[2].setText("boolean");
            jRadioButton[3].setText("char");
        }
        if(currentFrame==1){
            l.setText("\"Que2: Which class is available to all the class automatically?\"");
             jRadioButton[0].setText("Swing");
             jRadioButton[1].setText("Applet");
             jRadioButton[2].setText("Object");
             jRadioButton[3].setText("ActionEvent");  
        }
        if(currentFrame==2){
            l.setText("Que3: Which package is directly available to our class without importing it?");
             jRadioButton[0].setText("swing");
             jRadioButton[1].setText("applet");
             jRadioButton[2].setText("net");
             jRadioButton[3].setText("lang");  
        }
        if(currentFrame==3){
            l.setText("Que4: String class is defined in which package?");
              jRadioButton[0].setText("lang");
              jRadioButton[1].setText("Swing");
              jRadioButton[2].setText("Applet");
              jRadioButton[3].setText("awt");  
        }
        if(currentFrame==4){
            l.setText("Que5: Which institute is best for java coaching?");
               jRadioButton[0].setText("Utek");
               jRadioButton[1].setText("Aptech");
               jRadioButton[2].setText("SSS IT");
               jRadioButton[3].setText("jtek");  
        }
        if(currentFrame==5){
            l.setText("Que6: Which one among these is not a keyword?");
              jRadioButton[0].setText("class");
              jRadioButton[1].setText("int");
              jRadioButton[2].setText("get");
              jRadioButton[3].setText("if");
        }
         if(currentFrame==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            jRadioButton[0].setText("Swing");
            jRadioButton[1].setText("Actionperformed");
            jRadioButton[2].setText("ActionEvent");  
            jRadioButton[3].setText("Button");  
        }  
        if(currentFrame==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            jRadioButton[0].setText("toString");
            jRadioButton[1].setText("finalize");
            jRadioButton[2].setText("equals");  
            jRadioButton[3].setText("getDocumentBase");         
        }  
        if(currentFrame==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            jRadioButton[0].setText("init");
            jRadioButton[1].setText("main");
            jRadioButton[2].setText("start");
            jRadioButton[3].setText("destroy");  
        }  
        if(currentFrame==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jRadioButton[0].setText("JButton");
            jRadioButton[1].setText("JList");
            jRadioButton[2].setText("JButtonGroup");  
            jRadioButton[3].setText("JTextArea");  
        }
          l.setBounds(30,40,450,20);  
          for(int i=0,j=0;i<=90;i+=30,j++)  
          jRadioButton[j].setBounds(50,80+i,200,20);  
    }
  public boolean check(){
       
        if(currentFrame==0)  
            return(jRadioButton[1].isSelected());  
        if(currentFrame==1)  
            return(jRadioButton[2].isSelected());  
        if(currentFrame==2)  
            return(jRadioButton[3].isSelected());  
        if(currentFrame==3)  
            return(jRadioButton[0].isSelected());  
        if(currentFrame==4)  
            return(jRadioButton[2].isSelected());  
        if(currentFrame==5)  
            return(jRadioButton[2].isSelected());  
        if(currentFrame==6)  
            return(jRadioButton[1].isSelected());  
        if(currentFrame==7)  
            return(jRadioButton[3].isSelected());  
        if(currentFrame==8)  
            return(jRadioButton[1].isSelected());  
        if(currentFrame==9)  
            return(jRadioButton[2].isSelected());
        return false;
      
  }

   
    public static void main(String[] args) {
        OnlineExam test=new OnlineExam("online exam of java");
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==nextButton){
            if(check()){
                counter=counter+1;  
                currentFrame++;  
                set();   
            }
               if(currentFrame==9)  
            {  
                nextButton.setEnabled(false);  
                bookmarkButton.setText("Result");  
            }
                 }  
        
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            frame[x]=currentFrame;  
            x++;  
            currentFrame++;  
            set();    
            if(currentFrame==9)  
                bookmarkButton.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                counter=counter+1;  
            now=currentFrame;  
            currentFrame=frame[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            currentFrame=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                counter=counter+1;  
                currentFrame++;  
            JOptionPane.showMessageDialog(this,"correct ans="+counter);  
            System.exit(0);  
        }  
        }
     }
    

