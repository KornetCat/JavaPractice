package lab14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String args[]){
        String regex = "([1-2]?[0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/(19\\d{2}|[2-9]\\d{3})";
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        JLabel label = new JLabel();
        JTextField first = new JTextField("Введите дату: ");
        first.setBounds(0, 0, 50, 10);
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = first.getText();
                Matcher matcher = pattern.matcher(b);
                boolean i;
                if(matcher.find()){
                    first.setText("День:"+matcher.group(1)+"\nМесяц:"+matcher.group(2)+"\nГод:"+matcher.group(3));
                } else {
                    first.setText("Неверный формат даты");
                }
            }
        });
        JFrame one = new JFrame();
        one.add(label.add(first));
        one.setBounds(0, 0, 300, 300);
        one.setVisible(true);
    }
}
