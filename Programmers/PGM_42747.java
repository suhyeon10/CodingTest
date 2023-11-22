package Programmers;

import java.util.Arrays;

public class PGM_42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int h= citations.length; h>=1; h--){
            if (isValid(citations, h)) return h;
        }
        return 0;
    }

    private boolean isValid(int[] citations, int h){
        int index = citations.length - h;
        return citations[index] >=h;
    }
}
