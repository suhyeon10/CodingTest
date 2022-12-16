package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PGM_138477 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));

    }
    public static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        List<Integer> topList = new ArrayList<>();

        for(int i =0; i<score.length; i++){

            if(topList.size() < k){
                topList.add(score[i]);
            }else{
                if(topList.get(0) < score[i]){
                    topList.set(0, score[i]);
                }
            }
            Collections.sort(topList);

            answer[i] = topList.get(0);
        }

        return answer;
    }
}
