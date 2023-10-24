package lab2.T;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.Console;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Shop r = new Shop(new ArrayList<>(10000));
        String b = console.nextLine();
        do{
            r.addonly(b);
            b = console.nextLine();
        }while(b!="");
        System.out.println(r.getshop());
        System.out.println("If you want to buy computer, enter the name: ");
        b = console.nextLine();
        if(r.contains(b)){
            r.remove(b);
            System.out.println("You have bought the computer "+b+"!");
        }else{
           System.out.println("We have no such computer");
        }
    }
}
