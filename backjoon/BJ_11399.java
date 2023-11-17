package backjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_11399 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        //오름차순 정렬
        Arrays.sort(arr);

        int prev = 0; // 이전까지의 대기시간 누적합
        int sum = 0; // 사람별 시간 총합

        for(int i = 0; i<N; i++) {
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해줌
            sum += prev + arr[i];

            // 이전까지의 누적합에 현재 걸리는 시간을 더해줌
            prev += arr[i];
        }
        System.out.println(sum);
    }
}
