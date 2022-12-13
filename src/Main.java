public class Main {
    public static void main(String[] args) {

        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));

    }
    public static int solution(String s){
        int answer = 0;
        char first = s.charAt(0);
        int diff = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(count==diff){
                answer++;
                first=s.charAt(i);
            }
            if (first == s.charAt(i)){
                count++;
            }
            else{
                diff++;
            }
        }
        return answer;
    }
}