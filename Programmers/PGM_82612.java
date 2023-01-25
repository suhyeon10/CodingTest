package Programmers;

public class PGM_82612 {
    public static void main(String[] args) {

    }
    public static long solution(int price, int money, int count){

        long answer = 0;
        long sum = 0;
        for(int i = 1; i<=count; i++){
            sum += price*i;
        }

        if(sum > money) answer = sum - money;
        return answer;
    }
}
