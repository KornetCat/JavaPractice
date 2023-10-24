package lab13.Ex1;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]){
        String regex = "(\\+*)(\\d+)(\\d{3})\\-?(\\d{3})\\-?(\\d{2})\\-?(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        Matcher matcher = pattern.matcher(b);
        boolean i;
        do {
            if (matcher.find()) {
                int to_work = matcher.groupCount();
                System.out.println(to_work);
                if (matcher.group(1) != "") {
                    System.out.println(matcher.group(1) + matcher.group(2) + "(" + matcher.group(3) + ")" + matcher.group(4) +
                            "-" + matcher.group(5) + "-" + matcher.group(6));
                } else {
                    System.out.println("+" + (Integer.parseInt(matcher.group(2)) - 1) + "(" + matcher.group(3) + ")" + matcher.group(4) +
                            "-" + matcher.group(5) + "-" + matcher.group(6));
                }
                i = false;
            } else {
                System.out.println("Неверный ввод");
                i = true;
                b = sc.nextLine();
            }
        }while(i);
    }
}
