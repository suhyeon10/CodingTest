package SWExpertAcademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SWEA_1206 {
    static int N;
    static int[] building;

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = 10;

        for(int tc = 1; tc<=T; tc++) {
            // 빌딩 개수 입력받기
            N = sc.nextInt();
            building = new int[N];

            // 빌딩의 건물 입력받기
            for(int i=0; i<N; i++) {
                building[i] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=2; i<N-2; i++) {
                //현재건물 좌우 2칸 범위사이의 건물들 중 가장 큰 높이값 찾기
                int max = Math.max(building[i-2], Math.max(building[i-1], Math.max(building[i+1], building[i+2])));
                //주변 건물의 최대 높이보다 현재 건물의 높이가 더 높다면, 높이 크기만큼 cnt를 늘려준다.
                if(max < building[i]) {
                    cnt += building[i] - max;
                }
            }
            System.out.println("#"+tc+" "+cnt);

        }
    }
}
