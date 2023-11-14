package Programmers;

import java.util.HashSet;

public class PGM_1845 {
    public int solution(int[] nums) {
        //해시셋 추가
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int max = nums.length/2;

        if(max>numSet.size()) return numSet.size();
        else return max;
    }
}
