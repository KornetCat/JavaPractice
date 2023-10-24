package lab1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int l = console.nextInt();
        int[] arr = new int[l];
        int s = 0;
        System.out.println("Введите элементы массива: ");
        for (int i=0; i<l; i++){
            arr[i] = console.nextInt();
            s += arr[i];
        }
        System.out.println("Сумма элементов: " + s);
        System.out.println("Среднее арифметическое: " + s/l);
    }
}
