package Lab_11;
import java.awt.*;
import java.awt.event.*;
public class awt_practise extends Frame{
    Frame  f;
    Label l1,l2,l3,l4;
    TextField tf1,tf2;
    TextArea ta1,ta2;
    Choice subject;
    Checkbox cb1,cb2,cb3;
    CheckboxGroup cbg;
    Button b1,b2;
    public awt_practise(){
        super("Registration Form");
        setSize(1000,700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(53, 59, 72);
        setBackground (formColor);
        
        Font titleFont = new Font("arial", Font.BOLD, 30);
        Font labelFont =new  Font("arial", Font.PLAIN, 18);
        
        l1 =new Label("Welcome to registration form");
        l1.setBounds(250,40,600,50);
        l1.setFont(titleFont);
        //titleFont.setForeground(Color.YELLOW);
        add(l1);
        l2=new Label("Name"); 
        l2.setBounds(250,100,150,30);
	l2.setFont(labelFont);  
        l2.setForeground(Color.WHITE);
	add(l2);
        
        
    }
    public static void main(String args[]){
        awt_practise a =new awt_practise();
        
        
        
    }
}
