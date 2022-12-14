package Programmers;

import java.util.*;

public class PMG_135807 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10,17}, new int[]{5,20}));
        System.out.println(solution(new int[]{10,20}, new int[]{5,17}));
        System.out.println(solution(new int[]{14,35,119}, new int[]{18,30,102}));

    }
    public static int solution(int[] arrayA, int[] arrayB){
        int answer = 0;

        int minA = Arrays.stream(arrayA).min().getAsInt();
        int minB = Arrays.stream(arrayB).min().getAsInt();

        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<>(set);
        for(int i = 2; i<=minA; i++){
            if(minA % i == 0){
                set.add(i);
            }
        }
        for(int i = 2; i<=minB; i++){
            if(minB % i == 0){
                set.add(i);
            }
        }

        for(int e : set){
            boolean chk = true;
            // A:O, B:X
            for(int i = 0; i<arrayA.length; i++){
                if(arrayA[i] % e != 0 || arrayB[i] % e == 0){
                    chk = false;
                    break;
                }

            }

            if(chk) {
                answer = Math.max(answer, e);
            }

            chk = true;
            // A:X, B:O
            for(int i = 0; i<arrayA.length; i++){
                if(arrayA[i] % e == 0 || arrayB[i] % e != 0){
                    chk = false;
                    break;
                }

            }

            if(chk) {
                answer = Math.max(answer, e);
            }
            
        }

        return answer;
    }
}
