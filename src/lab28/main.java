package lab28;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class main {
    public static Map createMap(){
        Map<String, String> map = new Hashtable<>();
        map.put("Alex", "Smith");
        map.put("Marty", "Black");
        map.put("Alex", "White");
        map.put("Alex", "Blue");
        map.put("Marty", "Smith");
        map.put("Phil", "Black");
        map.put("Alex", "Holmes");
        map.put("Michel", "Watson");
        map.put("Kate", "Smith");
        map.put("Ann", "Peterson");
        return map;
    }
    public static int getSameFirstNameCount(Map a){
        int b = 0;
        System.out.println(a.values());
        for(Object i: a.values()){
            if(Collections.frequency(a.values(),i)>1){
                b+=Collections.frequency(a.values(),i);
            }
        }
        return b;
    }
    public static void main(String args[]){
        Map<String, String> map = createMap();
        System.out.println(getSameFirstNameCount(map));
    }
}
