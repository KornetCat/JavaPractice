package lab2.T;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Shop {
    public List<String> shlist = new ArrayList<String>();
    public Shop(List shlist){
        this.shlist = shlist;
    }
    public void addonly(String comp){
        this.shlist.add(comp);
    }
    public void addalot(List<String> comps){
        this.shlist.addAll(comps);
    }
    public String getshop(){
        return this.shlist.toString();
    }
    public boolean contains(String comp){
        return this.shlist.contains(comp);
    }
    public void remove(String comp){
        this.shlist.remove(comp);
    }
}
