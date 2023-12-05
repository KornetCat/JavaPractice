package lab24.S;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Abadakidabra! *Magic*");
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }
}
