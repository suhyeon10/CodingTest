package backjoon;

import java.io.*;
import java.math.BigInteger;

public class BJ_13706 {
    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger start = new BigInteger("1");
        BigInteger end = N;
        BigInteger mid;

        while (true) {

            //더하기
            mid = start.add(end);
            //중간값 구하기
            mid = mid.divide(new BigInteger("2"));

            // 제곱값과 N을 비교
            int result = (mid.multiply(mid)).compareTo(N);
            //일치
            if (result == 0) break;
                //mid제곱근>N
            else if (result == 1) end = mid.subtract(new BigInteger("1"));
                // result = -1 =? mid제곱근 < N
            else start = mid.add(new BigInteger("1"));
        }

        bw.write(mid.toString());
        br.close();
        bw.close();

    }
}