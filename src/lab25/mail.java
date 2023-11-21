package lab25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mail {
    public static void main(String args[]){
        String regex = "\\w+@[a-zA-Z](\\.[a-zA-Z])?";
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите почту: ");
        String b = sc.nextLine();
        Matcher matcher = pattern.matcher(b);
        boolean i;
        if(matcher.find()){
            System.out.println("Верный формат почты");
        } else {
            System.out.println("Неверный формат почты");
        }
    }
}
