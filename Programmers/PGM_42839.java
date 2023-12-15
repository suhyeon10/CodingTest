package Programmers;

import java.util.HashSet;
import java.util.Set;

public class PGM_42839 {

    public static Set<Integer> intSet = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;

        // 가능한 모든 숫자들 만들기
        combineString("", numbers);

        //소수 체크
        for (int num : intSet) {
            if (isPrime(num)) answer++;
        }
        return answer;
    }

    //가능한 모든 숫자 만들기
    private void combineString(String combine, String numbers) {

        if(!combine.equals("")){
            intSet.add(Integer.parseInt(combine));
        }
        for(int i=0; i<numbers.length(); i++){
            combineString(combine+numbers.charAt(i), numbers.substring(0, i)+numbers.substring(i+1));
        }

    }

    //소수인지 확인
    private boolean isPrime(int num){
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
