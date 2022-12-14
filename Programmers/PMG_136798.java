package Programmers;

import java.util.ArrayList;

public class PMG_136798 {
    public static void main(String[] args) {
        System.out.println(solution(5,3,2));
        System.out.println(solution(10,3,2));
    }
    public static int solution(int number, int limit, int power){
        int answer = 0;
        for (int i =1; i<=number; i++){
            ArrayList<Integer> arr = new ArrayList<>();

            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){ // 약수 중 작은 수 저장
                    arr.add(j);
                    if(i / j != j){ // 약수 중 큰 수 저장
                        arr.add(i / j);
                    }
                }
            }

            if(limit<arr.size()){
                answer+=power;
            }else{
                answer+=arr.size();
            }
        }
        return answer;
    }
}
