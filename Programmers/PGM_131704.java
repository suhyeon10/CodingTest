package Programmers;

import java.util.Stack;

public class PGM_131704 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,3,1,2,5}));
        System.out.println(solution(new int[]{5,4,3,2,1}));
    }
    public static int solution(int[] order){
        int answer =0;

        Stack<Integer> subContainer = new Stack<>();
        int topBox = 1;
        for(int o : order){
            while(topBox<=order.length){
                if(topBox == o){
                    break;
                }else if(!subContainer.isEmpty() && subContainer.peek() == o){
                    break;
                }else{
                    subContainer.push(topBox);
                    topBox++;
                }
            }

            if (topBox == o){
                topBox++;
                answer++;
            }else if(!subContainer.isEmpty() && subContainer.peek() == o){
                subContainer.pop();
                answer++;
            }else{
                break;
            }

        }
        return answer;
    }
}
