package Lab_11;
import java.awt.*;
import java.awt.event.*;
public class awt5 implements ActionListener,ItemListener {
    TextField tf=new TextField();
    Choice c;
    Label l;
    awt5(){
        Frame f =new Frame("hello");
        Checkbox ch =new Checkbox("ABC");
        ch.setBounds(120,80,100,80);
        f.add(ch);
        Checkbox ch1 =new Checkbox("DEF");
        ch1.setBounds(120,160,100,80);
        f.add(ch1);
        l=new Label();
        l.setBounds(400,220,100,100);
        Button b =new Button("click here");
        b.setBounds(120,240,100,80);
        b.addActionListener(this);
        tf =new TextField();
        tf.setBounds(300,100,120,120);
        Button b1 =new Button("click here yourself");
        b1.setBounds(120,320,100,80);
        f.add(b);
        f.add(b1);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(800,500);
        c=new Choice();
        c.add("1");
        c.add("2");
        c.add("3");
        c.setBounds(120,400,100,100);
        c.addItemListener(this);
        f.add(c);
        f.add(tf);
        f.add(l);
    }
    public void actionPerformed(ActionEvent ae){
        tf.setText("Hamza");
    }
   
    @Override
    public void itemStateChanged(ItemEvent i){
        switch (c.getSelectedIndex()) {
            default :
                l.setText("Choice is 1");
                break;
            case 2:
                l.setText("Choice is 1");
                break;
            case 3:
                l.setText("Choice is 3");
                break;
        }
        
    }
    public static void main(String args[]){
        awt5 a=new awt5();
    }
}
