package labMatching;

public class Char {
    char a;

    public Char(char a) {
        this.a = a;
    }

    public char getA() {
        return a;
    }

    public void setA(char a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return a+"";
    }
}
