package lab8.Ex11;

import lab8.Ex12.Recu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rec {
    public static int rec(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==0){
            a = sc.nextInt();
            if(a==0){
                return 0;
            }
        }else if(a==1){
            return rec()+1;
        }
        return rec();
    }
    public static void main(String args[]) {
        try {
            System.out.println(Rec.rec());
        }catch (InputMismatchException e){
            System.out.println("Неверное значение!");
        }
    }
}
