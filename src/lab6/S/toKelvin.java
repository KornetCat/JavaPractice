package lab6.S;

public class toKelvin implements Convertable{
    @Override
    public double convert(double a) {
        return a+273.15;
    }
}
