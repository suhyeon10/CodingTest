package Programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PGM_68644 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3,4,1}));
        System.out.println(solution(new int[]{5,0,2,7}));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
