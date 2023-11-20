package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class PGM_42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<priorities.length;i++){
            queue.offer(priorities[i]);
        }

        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){

                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;

                    if(i == location)  return answer;
                }
            }

        }
        return answer;
    }
}
