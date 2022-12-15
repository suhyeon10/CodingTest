package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PGM_142085 {
    public static void main(String[] args) {
        System.out.println(solution(7, 3, new int[]{4,2,4,5,3,3,1}));
        System.out.println(solution(2, 4, new int[]{3,3,3,3}));

    }
    public static int solution(int n, int k, int[] enemy){
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i <enemy.length; i++){
            n -=enemy[i];
            pq.add(enemy[i]);

            if(n < 0){
                if (k > 0 && !pq.isEmpty()){
                    n += pq.poll();
                    k--;
                }else{
                    answer = i;
                    break;
                }

            }
        }
        return answer;
    }
}
