package lab17;

import lab19.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class tester extends JFrame{
    public StudentList k = new StudentList();
    public tester(){
        super("Окно списка");
        final TextArea tf=new TextArea();
        tf.setBounds(50,20, 150,130);
        final TextField tf2=new TextField();
        tf2.setBounds(220, 20, 50, 20);



        Button b=new Button("Добавить нового студента");
        b.setBounds(50,150,60,30);
        b.setSize(150,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String m = tf.getText();
                    String[] n = m.split(", ");
                    k.add(new lab17.Student(n));
                    tf.setText("Профиль успешно добавлен!\nВведите ФИО и номер Группы " +
                            "через запятую для добавления нового профиля");
                }catch (Exception ex){
                    try{
                        String m = tf.getText();
                        String[] n = m.split(",");
                        k.add(new lab17.Student(n));
                        tf.setText("Профиль успешно добавлен!\nВведите ФИО и номер Группы " +
                                "через запятую для добавления нового профиля");
                    }catch(Exception ex1) {
                        tf.setText("Неверный формат ввода");
                    }
                }
            }
        });

        Button a=new Button("Вывести список студентов");
        a.setBounds(220,150,60,30);
        a.setSize(150,50);
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(k.isEmpty()) {
                    tf.setText("Список пуст");
                }else {
                    String names = "";
                    for (Student i : k) {
                        names += i.Name + " " + i.GroupNumber + "\n";
                    }
                    tf.setText(names);
                }
            }
        });

        Button c=new Button("Очистить список");
        c.setBounds(50,210,60,30);
        c.setSize(150,50);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                k = new StudentList();
            }
        });

        Button d=new Button("Вывести элемент");
        d.setBounds(220,210,60,30);
        d.setSize(150,50);
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int l = Integer.parseInt(tf2.getText());
                tf.setText(k.get(l+1).PrintOn());
            }
        });

        Button j=new Button("Удалить элемент");
        j.setBounds(220,90,60,30);
        j.setSize(150,50);
        j.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int l = Integer.parseInt(tf2.getText());
                    k.remove(l - 1);
                    tf.setText("Объект успешно удалён");
                }catch(Exception ex){
                    tf.setText("Ошибка");
                }
            }
        });

        Button p=new Button("Очистить окно ввода-вывода");
        p.setBounds(50,270,60,30);
        p.setSize(320,50);
        p.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
            }
        });

        add(c);add(b);add(a);add(d);add(j);add(p);add(tf);add(tf2);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new tester();
            }
        });
    }
}
