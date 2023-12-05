package lab24.S;

public class Client {
    Chair chair;
    public void sit(){
        System.out.println("I'm sitting on "+chair.toString());
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }

    public static void main(String arg[]){
        Client a = new Client();
        ChairFactory b = new ChairFactory();
        a.setChair(b.createMagicChair());
        a.sit();
    }
}
