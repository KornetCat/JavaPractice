package lab3.T;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    public double rubles;
    public static double dollarCurse = 96.63;
    public static double euroCurse = 103.04;
    public Converter(int mon){
        this.rubles = (double) mon;
    }
    public Converter(double mon){
        this.rubles = mon;
    }
    public static Converter fromDollar(int mon){
        return new Converter(mon*Converter.dollarCurse);
    }
    public static Converter fromEuro(int mon){
        return new Converter(mon*Converter.euroCurse);
    }
    public double GetRubles(){
        return this.rubles;
    }
    public String GetDollars(){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat.format(this.rubles/this.euroCurse);
    }
    public String GetEuro(){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return numberFormat.format(this.rubles/this.euroCurse);
    }
}
