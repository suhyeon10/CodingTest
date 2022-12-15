package Programmers;

import java.util.*;

public class PGM_131701 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,9,1,1,4}));
    }
    public static int solution(int[] elements){
        int answer = 0;

        int[] doubleArr =  new int[elements.length*2];
        System.arraycopy(elements, 0, doubleArr, 0, elements.length);
        System.arraycopy(elements, 0, doubleArr, elements.length, elements.length);

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i< elements.length; i++){
            for(int j = 0; j<elements.length; j++){
                set.add(Arrays.stream(Arrays.copyOfRange(doubleArr, i, i+j)).sum());
            }
        }
        return set.size();
    }
}
