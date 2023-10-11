package Programmers;

public class PGM_67256 {

    public static void main(String[] args) {

    }

    public static String solution(int[] numbers, String hand){
        String answer = "";
        int left =10;
        int right =12;
        for(int i=0; i<numbers.length; i++){
            switch (numbers[i]){
                case 1, 4, 7:
                    answer+="L";
                    left = numbers[i];
                    break;
                case 3,6,9:
                    answer+="R"; right = numbers[i]; break;
                case 2,5,8,0:
                    if(numbers[i]==0) numbers[i]=11;
                    int leftdist = Math.abs(numbers[i]-left)/3 + Math.abs(numbers[i]-left)%3;
                    int rightdist = Math.abs(numbers[i]-right)/3 + Math.abs(numbers[i]-right)%3;

                    if(leftdist>rightdist){
                        answer+="R";
                        right = numbers[i];
                    } else if (leftdist <rightdist) {
                        answer+="L";
                        left = numbers[i];

                    }else{
                        if(hand.equals("right")){
                            answer+="R";
                            right = numbers[i];
                        }else{
                            answer+="L";
                            left = numbers[i];
                        }
                    }
            }
        }
        return answer;
    }
}
