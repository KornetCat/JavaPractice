package lab7;

public interface StringWork {
    static int count(String a){
        int c = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=' ' & a.charAt(i)!='\t'){
                c++;
            }
        }
        return c;
    }
    static String nech(String a){
        String b = "";
        for(int i=0; i<a.length(); i++){
            if(i%2==1){
                b += a.charAt(i);
            }
        }
        return b;
    }
    static String invert(String a){
        String b = "";
        for(int i=a.length()-1; i>=0; i--){
            b+=a.charAt(i);
        }
        return b;
    }
}
