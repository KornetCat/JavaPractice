package lab3.T;

public class Tester {
    public static void main(String[] args){
        Converter a = new Converter(5);
        Converter b = Converter.fromDollar(5);
        Converter c = Converter.fromEuro(5);
        System.out.println(a.GetRubles()+" rubles are: "+a.GetDollars()+", "+a.GetEuro());
        System.out.println(b.GetDollars()+" are: "+b.GetRubles()+" rubles, "+b.GetEuro());
        System.out.println(c.GetEuro()+" are: "+c.GetDollars()+", "+c.GetRubles()+" rubles");
    }
}
