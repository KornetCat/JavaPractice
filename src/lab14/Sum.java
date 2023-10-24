package lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum {
    public static void main(String args[]){
        String regex = "(\\d+)(\\.\\d{1,2}) (RUB|USD|EUR)";
        Pattern pattern = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        boolean i;
        do {
            Matcher matcher = pattern.matcher(b);
            if (matcher.find()) {
                System.out.println(matcher.group(1) + matcher.group(2));
                i = false;
            } else {
                System.out.println("Неверный формат суммы");
                b = sc.nextLine();
                i = true;
            }
        }while(i);
    }
}
