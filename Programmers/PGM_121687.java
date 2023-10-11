package Programmers;

public class PGM_121687 {

    public int[] solution(String command) {
        int[] answer = {0,0};
        int directionIndex = 0;

        for(int i =0; i<command.length(); i++){

            char temp = command.charAt(i);
            System.out.println(temp);

            String[] direction = new String[]{"위", "오른쪽", "아래", "왼쪽"};
            if(temp == 'R'){
                if(directionIndex == 3) directionIndex=0;
                else directionIndex+=1;
            }else if(temp == 'L'){
                if(directionIndex == 0) directionIndex=3;
                else directionIndex-=1;
            }else if(temp == 'G'){
                // 한칸 전진
                if(directionIndex == 0) answer[1]+=1;
                else if (directionIndex == 1) answer[0]+=1;
                else if (directionIndex == 2) answer[1]-=1;
                else answer[0]-=1;

            }else if(temp == 'B'){
                // 한칸 후진
                if(directionIndex == 0) answer[1]-=1;
                else if (directionIndex == 1) answer[0]-=1;
                else if (directionIndex == 2) answer[1]+=1;
                else answer[0]+=1;
            }
        }

        return answer;
    }
}
