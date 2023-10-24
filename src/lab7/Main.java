package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.println(StringWork.count(a));
        System.out.println(StringWork.nech(a));
        System.out.println(StringWork.invert(a));
    }
}
