package lab13.Ex2;

import lab13.Ex2.Shirt;

public class Tester {
    public static void main(String args[]){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt, White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] arr = new Shirt[11];
        for(int i=0;i<shirts.length;i++){
            String[] a = shirts[i].split(",");
            arr[i] = new Shirt(a[0], a[1], a[2], a[3]);
        }
        for(Shirt i: arr){
            System.out.println(i+"\n");
        }
    }
}
