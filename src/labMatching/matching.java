package labMatching;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matching {
    public static boolean aaa(String exp) {
        String regex = "[\\[\\(\\{]";
        Pattern pattern = Pattern.compile(regex);
        Stack<Char> k = new Stack<>();
        int r = 0;
        boolean j;
        for (int i = 0; i < exp.length(); i++) {
            char a = exp.charAt(i);
            Char b = new Char(a);
            Matcher n = pattern.matcher(b.toString());
            if (n.find()) {
                k.push(b);
            } else {
                char o = k.pop().getA();
                if (o == '(' & b.getA() == ')'
                        | o == '[' & b.getA() == ']'
                        | o == '{' & b.getA() == '}') {
                    r++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(aaa(exp));
    }
}
