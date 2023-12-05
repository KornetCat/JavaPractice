package lab27;
import java.math.BigInteger;
import java.security.*;
import java.util.ArrayList;
import java.util.Dictionary;

public class hashtab<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;
    private String convertToHex(final byte[] messageDigest) {
        BigInteger bigint = new BigInteger(1, messageDigest);
        String hexText = bigint.toString(16);
        while (hexText.length() < 32) {
            hexText = "0".concat(hexText);
        }
        return hexText;
    }
    public String hashtabHash(String input) throws NoSuchAlgorithmException {
        String hashtext = null;
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Compute message digest of the input
        byte[] messageDigest = md.digest(input.getBytes());

        hashtext = convertToHex(messageDigest);

        return hashtext;
    }

    public hashtab() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }
    public void hashtabAdd(K a, V b){
        if(keys.indexOf(a)==-1){
            keys.add(a);
            values.add(b);
        }else{
            values.add(keys.indexOf(a), b);
        }
    }
    public V hashtabLookup(K a){
        try {
            return values.get(keys.indexOf(a));
        }catch (Exception e){
            return null;
        }
    }
    public void hashtabDelete(String b){
        int a = keys.indexOf(b);
        keys.remove(a);
        values.remove(a);
    }
    public static void main(String arg[]){
        hashtab<String,String> a = new hashtab<>();
        a.hashtabAdd("Alex", "Smith");
        a.hashtabAdd("Marty", "Black");
        a.hashtabAdd("Alex", "White");
        a.hashtabAdd("Alex", "Blue");
        a.hashtabAdd("Marty", "Smith");
        a.hashtabAdd("Phil", "Black");
        a.hashtabAdd("Alex", "Holmes");
        a.hashtabAdd("Michel", "Watson");
        a.hashtabAdd("Kate", "Smith");
        a.hashtabAdd("Ann", "Peterson");
        System.out.println(a.hashtabLookup("Alex"));
        a.hashtabDelete("Alex");
        System.out.println(a.hashtabLookup("Alex"));
    }
}
