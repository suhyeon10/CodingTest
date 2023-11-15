package Programmers;

import java.util.ArrayList;

public class PGM_12906 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int a : arr){
            int idx = list.size();
            if(!list.get(idx-1).equals(a)) list.add(a);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
