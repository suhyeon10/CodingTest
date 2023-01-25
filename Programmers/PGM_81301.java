package Programmers;


public class PGM_81301 {
    public static void main(String[] args) {

    }
    public static int soultion(String s){

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }
}
