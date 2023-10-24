package lab3.F;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Double> myList = new ArrayList<>();
        for(int i=0;i<100;i++){
            myList.add(rand.nextDouble()*100);
        }
        System.out.println("Список, сгенерированный Random: "+myList);
        List<Double> mlst = new ArrayList<>();
        for(int i=0;i<100;i++){
            mlst.add(Math.random()*100);
        }
        System.out.println("Список, сгенерированный Math.random: "+mlst);
    }
}
