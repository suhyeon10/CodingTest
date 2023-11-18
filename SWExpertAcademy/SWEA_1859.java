package SWExpertAcademy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SWEA_1859 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String str= sc.nextLine();

        for(int i=1; i<=T; i++) {
            // N일 동안 물건 매매가를 입력
            int N = Integer.parseInt(sc.nextLine());
            List<Integer> numList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int[] temp = new int[numList.size()];
            int maxPrice = 0;
            double result = 0;

            for(int j= N-1; j>=0; j--) {

                // 매매가를 뒤에서 부터 탐색
                if(maxPrice < numList.get(j)) {
                    // 최대 매매가 갱신
                    maxPrice = numList.get(j);
                }
                // 최대 이익 계산하고 저장
                temp[j] = maxPrice-numList.get(j);

            }
            for(int k=0; k<temp.length; k++) {
                // 최대 이익을 모두 더한다.
                result += temp[k];
            }
            // 반올림하여 출력
            System.out.println("#"+i+" "+Math.round(result));

        }
    }
}
