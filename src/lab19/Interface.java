package lab19;

import lab15.Ex2.CountriesMenu;
import lab17.StudentList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interface extends JFrame {
    public Interface(){
        super("Окно списка");
        final TextField tf=new TextField();
        tf.setBounds(50,50, 250,20);
        tf.setSize(300, 100);


        ArrayList<lab19.Student> k = new ArrayList<Student>();


        Button b=new Button("Добавить нового студента");
        b.setBounds(50,150,60,30);
        b.setSize(100,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String m = tf.getText();
                    String[] n = m.split(",");
                    k.add(lab19.Student.Students(n));
                    tf.setText("Профиль успешно добавлен!\nВведите ФИО и номер ИНН " +
                            "через запятую для добавления нового профиля");
                }catch (Exception ex){
                    tf.setText("Неверный формат ввода");
                }
            }
        });


        Button a=new Button("Вывести список студентов");
        a.setBounds(200,150,60,30);
        a.setSize(100,50);
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String names = "";
                for(Student i: k){
                    names+=i.FIO+" "+i.INN+"\n";
                }
                tf.setText(names);
            }
        });


        add(b);add(a);add(tf);
        setSize(400,300);
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
