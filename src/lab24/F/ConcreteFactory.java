package lab24.F;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        Complex a = new Complex();
        a.image = image;
        a.real = real;
        return a;
    }
}
