package Programmers;

import java.util.Stack;

public class PGM_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int index = stack.pop();
                answer[index] = i-index;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int index = stack.pop();
            answer[index] = prices.length-1-index;
        }


        return answer;
    }
}
