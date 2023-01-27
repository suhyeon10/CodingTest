package Programmers;

public class PGM_68935 {
    public static void main(String[] args) {

    }

    public static int solution(int n){
        int answer = 0;

        String intList = "";
        while(n!=0){
            intList += n%3;
            n/=3;
        }

        answer = Integer.parseInt(intList, 3);
        return answer;
    }
}
