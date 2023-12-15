package Programmers;

public class PGM_87946 {
    //k : 유저의 현재 피로도 (1~5000)
    //dungeons : 각 던전별 "최소 필요피로도 / 소모 피로도"
    //return : 유저가 탐험할 수 있는 최대 던전 수
    static int max =0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        // 최소필요도 <= K 일때 던전 진행가능

        //던전 진행시 K-소모 피로도
        // 1) 제일 최소필요도가 큰 던전
        // 2) 제일 소모 피로도가 적은 던전

        explore(k, 0, visited, dungeons);
        return max;

    }

    public void explore(int k, int count, boolean[] visited, int[][] dungeons ){
        for(int i=0; i<dungeons.length; i++){
            if(visited[i]) continue;

            if(dungeons[i][0] <=k ){
                visited[i] =true;
                explore(k-dungeons[i][1], count+1, visited, dungeons);
                visited[i]=false;
            }

        }

        max = Math.max(count,max);

    }
}
