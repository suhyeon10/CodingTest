package Programmers;

import static Programmers.PGM_131705.Solution.solution;

public class PGM_131705 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2,3,0,2,-5}));
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(solution(new int[]{-1, 1, -1, 1}));

    }

    static class Solution {static int numArr[];
        static int N;
        static int temp[] = new int[3];
        static int count = 0;

        public static int solution(int[] number) {
            int answer = 0;
            N = number.length;
            numArr = number;
            DFS(0,0);
            return count;
        }
        private static void DFS(int idx, int depth){
            if(depth == 3){
                int sum = 0;
                for(int i = 0 ; i < 3; i++){
                    sum += temp[i];
                }
                if(sum == 0){
                    count++;
                }
                return;
            }

            for(int i = idx; i < N; i++){
                temp[depth] = numArr[i];
                DFS(i+1, depth + 1);
            }
        }
    }

}
