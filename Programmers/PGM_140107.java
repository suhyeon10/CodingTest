package Programmers;

public class PGM_140107 {
    public static void main(String[] args) {
        System.out.println(solution(2,4));
        System.out.println(solution(1,5));

    }
    public static long solution(int k, int d){
        long answer = 0;

        for(int i=0; i<=d/k; i++){
            long x=i*k;
            long y = (long) (Math.sqrt( Math.pow(d,2) - Math.pow(x, 2)) / k);

//            System.out.println(y);

            answer+=y+1;
        }
        return answer;
    }
}
