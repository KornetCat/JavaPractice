package lab1;

import java.util.Scanner;

public class Third {
    public static int fact(int a){
        if(a==1){
            return 1;
        }
        else{
            return fact(a-1)*a;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int l = console.nextInt();
        int s = fact(l);
        System.out.println("Факториал числа: " + s);
    }
}
