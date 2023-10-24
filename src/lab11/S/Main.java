package lab11.S;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            String form = sc.nextLine();
            Student a = new Student("John", "Steel", "09.03.01",
                    2, 4, 60, new Date(104, 2, 6), form);
            System.out.println(a);
        }catch (Exception e){
            System.out.println("Wrong format type");
        }
    }
}
