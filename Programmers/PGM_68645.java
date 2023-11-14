package Programmers;

import java.util.Arrays;

public class PGM_68645 {

    private static final int[] dx = {0,1,-1};
    private static final int[] dy = {1,0,-1};

    public int[] solution(int n) {
        int[] answer = {};

        // 1. 배열 n x n 초기화
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        int v = 1;


        while(true){
            // 2. 숫자 채워넣기
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 2-1. 방향 바꾸기
            if(nx==n || ny==n || nx == -1 || ny == -1 || triangle[ny][nx]!=0){
                d = (d + 1) %3;
                nx = x + dx[d];
                ny = y + dy[d];
                if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx]!=0){
                    break;
                }
                x = nx;
                y = ny;

            }




        }






        // 3. 하나의 배열로 변환하기
        return answer;

    }
}
