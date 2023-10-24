package lab1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int l = console.nextInt();
        int[] arr = new int[l];
        int s = 0, i = 0, ma=0, mi=0;
        System.out.println("Введите элементы массива: ");
        while (i < l) {
            arr[i] = console.nextInt();
            if(i==0){
                mi=arr[i];
            }
            s += arr[i];
            if(mi>arr[i]){
                mi=arr[i];
            }
            if(ma<arr[i]){
                ma=arr[i];
            }
            i++;
        }
        System.out.println("Сумма элементов: " + s);
        System.out.println("Минимум: " + mi);
        System.out.println("Максимум: " + ma);
    }
}
