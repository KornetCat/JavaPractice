package lab29;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int num = sc.nextInt();
        int[][] g = new int[num][num];
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                g[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                sum += g[i][j];
            }
        }
        System.out.println(sum/2);
    }
}
