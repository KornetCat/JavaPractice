package lab22;

import lab19.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface extends JFrame {
    public Interface(){
        super("Окно списка");
        final TextField tf=new TextField();
        tf.setBounds(0,0, 300,50);
        tf.setFont(new Font("Serif",Font.BOLD,20));

        Button a1=new Button("7");
        a1.setBounds(0,50,75,50);
        a1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"7 ");
            }
        });

        Button a2=new Button("8");
        a2.setBounds(75,50,75,50);
        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"8 ");
            }
        });

        Button a3=new Button("9");
        a3.setBounds(150,50,75,50);
        a3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"9 ");
            }
        });

        Button a4=new Button("/");
        a4.setBounds(225    ,50,75,50);
        a4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"/ ");
            }
        });

        Button b1=new Button("4");
        b1.setBounds(0,100,75,50);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"4 ");
            }
        });

        Button b2=new Button("5");
        b2.setBounds(75,100,75,50);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"5 ");
            }
        });

        Button b3=new Button("6");
        b3.setBounds(150,100,75,50);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"6 ");
            }
        });

        Button b4=new Button("*");
        b4.setBounds(225,100,75,50);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"* ");
            }
        });

        Button c1=new Button("1");
        c1.setBounds(0,150,75,50);
        c1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"1 ");
            }
        });

        Button c2=new Button("2");
        c2.setBounds(75,150,75,50);
        c2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"2 ");
            }
        });

        Button c3=new Button("3");
        c3.setBounds(150,150,75,50);
        c3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"3 ");
            }
        });

        Button c4=new Button("-");
        c4.setBounds(225,150,75,50);
        c4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"- ");
            }
        });

        Button d1=new Button("0");
        d1.setBounds(0,200,75,50);
        d1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            }
        });

        Button d2=new Button(".");
        d2.setBounds(75,200,75,50);
        d2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"0 ");
            }
        });

        Button d3=new Button("+");
        d3.setBounds(150,200,75,50);
        d3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(tf.getText()+"+ ");
            }
        });

        Button d4=new Button("=");
        d4.setBounds(225,200,75,50);
        d4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    RPN m = new RPN(tf.getText());
                    Double n = m.viv();
                    tf.setText(n.toString());
                }catch(Exception ex){
                    tf.setText("Ошибка ввода");
                }
            }
        });

        Button e=new Button("Очистить поле ввода");
        e.setBounds(0,250,300,50);
        e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
        });

        add(a1);add(a2);add(a3);add(a4);
        add(b1);add(b2);add(b3);add(b4);
        add(c1);add(c2);add(c3);add(c4);
        add(d1);add(d2);add(d3);add(d4);
        add(tf);add(e);
        setSize(310,330);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Interface();
            }
        });
    }
}
