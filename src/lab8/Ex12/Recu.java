package lab8.Ex12;

import lab8.Ex11.Rec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recu {
    public static void rec(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                rec();
            } else {
                rec();
            }
        }
    }
    public static void main(String args[]) {
        try {
            Recu.rec();
        }catch (InputMismatchException e){
            System.out.println("Неверное значение!");
        }
    }
}
