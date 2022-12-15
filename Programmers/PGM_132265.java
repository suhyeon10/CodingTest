package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PGM_132265 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1,3,1,4,1,2}));
        System.out.println(solution(new int[]{1,2,3,1,4}));

    }
    public static int solution(int[] topping){
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int t : topping){
            map.put(t, map.getOrDefault(t,0)+1);
        }

        for(int t: topping){
            set.add(t);

            if(map.get(t) == 1){
                map.remove(t);
            }else{
                map.put(t, map.get(t)-1);
            }

            if(map.size() == set.size()){
                answer++;
            }
        }

        return answer;
    }
}
