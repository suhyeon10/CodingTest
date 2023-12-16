package Programmers;

import java.util.PriorityQueue;

public class PGM_42626 {
    // scoville : 2~1000000, 음식의 스코빌 지수
    // K : 스코빌 지수
    // 스코빌 지수가 가장 낮은 2개를 섞음
    // 섞은 음식의 스코빌 지수 = 덜매운 음식 + 더매운음식*2
    // return : 모든 음식의 스코빌 지수를 K이상으로 만들기 위한 최소 횟수

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count=0;

        for(int s: scoville){
            pq.add(s);
        }

        while(pq.peek() < K){
            if(pq.size()<2) return -1;
            int a = pq.poll();
            int b = pq.poll();

            int newScovile = a + b*2;
            pq.add(newScovile);
            count++;
        }

        return count;
    }
}
