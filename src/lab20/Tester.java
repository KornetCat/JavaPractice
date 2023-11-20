package lab20;

public class Tester {
    public static void main(String[] args){
        MinMax<Integer> a = new MinMax<Integer>(new Integer[]{12, 23, 55, 54});
        System.out.println("Минимальное значение: "+a.min());
        System.out.println("Максимальное значение: "+a.max());
    }
}
