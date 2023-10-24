package lab13.Ex2;

public class Shirt {
    public String Code;
    public String Type;
    public String Color;
    public String Size;

    public Shirt(String code, String type, String color, String size) {
        Code = code;
        Type = type;
        Color = color;
        Size = size;
    }

    @Override
    public String toString() {
        return Type+"\nColor: "+Color+"\nSize: "+Size+"\nCode: "+Code;
    }
}
