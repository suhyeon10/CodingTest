package SWExpertAcademy;

import java.io.IOException;
import java.util.Scanner;

public class SWEA_16910 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i<=T; i++) {
            int N = sc.nextInt(); //반지름
            int count = 0;
            for(int j = -N; j<=N; j++) {
                for(int k = -N; k<=N; k++) {
                    if(j*j + k*k <= N*N) count++;
                }
            }
            System.out.println("#"+i+" "+count);

        }
    }
}
