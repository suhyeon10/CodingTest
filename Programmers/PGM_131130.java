package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PGM_131130 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{8,6,3,7,2,5,1,4}));
    }
    public static int solution(int[] cards){

        int length = cards.length;
        int[] max = {-1, -1};

        for(int i = 0; i<length; i++){
            if(cards[i] == -1){
                continue;
            }

            int circleSize = circuit(cards, i);

            if( max[0] < circleSize){
                max[1] = max[0];
                max[0] = circleSize;
            }else if(max[1] < circleSize){
                max[1] = circleSize;
            }
        }
        if(max[0] == length){
            return 0;
        }else{
            return max[0] * max[1];
        }
    }

    private static int circuit(int[] cards, int index){
        if(cards[index] == -1){
            return 0;
        }
        int nextIndex = cards[index] -1;
        cards[index] = -1;

        return circuit(cards, nextIndex) + 1;
    }
}
