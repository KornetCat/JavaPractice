package lab15;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        Frame f=new Frame("ActionListener Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50, 250,20);
        Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        b.setSize(100,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Добро пожаловать в мир Джава.");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
