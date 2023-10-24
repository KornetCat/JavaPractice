package lab3.S;

public class Obls {
    public static void main(String[] args){
        Double s = Double.valueOf(5.1);
        System.out.println(s);
        s = Double.parseDouble("9.11");
        System.out.println(s);
        System.out.println("byte: "+s.byteValue());
        System.out.println("int: "+s.intValue());
        System.out.println("short: "+s.shortValue());
        System.out.println("long: "+s.longValue());
        System.out.println("float: "+s.floatValue());
        String d = Double.toString(s);
        System.out.println("string double: "+d);
    }
}
