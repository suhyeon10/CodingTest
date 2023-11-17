package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_12871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int len1 = str1.length();
        int len2 = str2.length();
        String temp = str1;
        String temp2 = str2;

        if(len1 != len2) {
            int len = LCM(len1, len2);

            while(temp.length() != len) {
                temp += str1;
            }
            while(temp2.length() != len) {
                temp2 += str2;
            }
        }
        if(temp.equals(temp2)) System.out.println(1);
        else System.out.println(0);

    }

    //최대공약수
    static int GCD(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return GCD(b, a%b);
    }
    //최소공배수
    static int LCM(int a, int b) {
        return (a*b)/GCD(a,b);
    }
}
