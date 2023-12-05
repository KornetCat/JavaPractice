package lab26;

import java.util.Stack;

public class Inv {
    public static void printmas(Object[] b){
        for(Object i: b){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String arg[]){
        Stack a = new Stack<>();
        Object[] b = new Integer[]{1, 2, 4, 5};
        printmas(b);
        for(Object i: b){
            a.push(i);
        }
        for(int i=0;i<b.length;i++){
            b[i] = a.pop();
        }
        printmas(b);
    }
}
