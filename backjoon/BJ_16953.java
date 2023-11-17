package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int ans = 1;
        while(B != A) {
            if(B < A) {
                ans = -1;
                break;
            }

            String str = String.valueOf(B);

            // 맨끝자리가 1이거나 B가 2로 떨어지지 않는 다면 A로 만들수없음
            if(isEndWith1(str)&& B%2 !=0 ) {
                ans = -1;
                break;
            }
            if (B%2==0) {
                B>>=1;
            }
            else {
                // 마지막 글자 제거
                str = str.substring(0, str.length()-1);
                B= Long.parseLong(str);
            }
            ans++;
        }
        System.out.println(ans);


    }
    static boolean isEndWith1(String str) {
        return str.charAt(str.length() - 1)!= '1';
    }
}
