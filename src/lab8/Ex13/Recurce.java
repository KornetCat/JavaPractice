package lab8.Ex13;

import lab8.Ex11.Rec;
import lab8.Ex12.Recu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recurce {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion();
            }
        }
    }
    public static void main(String args[]) {
        try {
            recursion();
        }catch (InputMismatchException e){
            System.out.println("Неверное значение!");
        }
    }
}
