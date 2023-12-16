package Programmers;

public class PGM_86971 {
    // n : 송전탑의 개수
    // wires : 전선정보 tree
    // 송전탑의 개수를 비슷하게 맞춰야함
    static int answer=Integer.MAX_VALUE; //두 전력망이 가지고 있는 송전탑 개수의 차이
    static int startNode=1;
    public int solution(int n, int[][] wires) {


        for(int i=0; i<wires.length; i++){
            // 송전탑 하나만 끊기
            int[][] arr = devideTree(n, wires, i);

            // 연결된 송전탑의 개수 계산하기
            boolean[] visited = new boolean[n+1];
            dfs(visited, arr, 1);

            int visitCount = countConnected(visited);
            int sub = Math.abs(visitCount - (n-visitCount));

            System.out.println(sub);
            answer = Math.min(sub, answer);

        }

        return answer;
    }
    public void dfs(boolean[] visited, int[][] arr, int node){
        visited[node] = true;
        for(int j=1; j< arr.length; j++){
            if(!visited[j] && arr[node][j]==1){
                dfs(visited, arr, j);
            }
        }
    }

    public int[][] devideTree(int n, int[][] wires, int ignore){
        int[][] arr = new int[n+1][n+1];
        for(int i=0; i<wires.length; i++){
            if(i!=ignore){
                arr[wires[i][0]][wires[i][1]] = 1;
                arr[wires[i][1]][wires[i][0]] = 1;
            }
        }
        return arr;
    }

    public int countConnected(boolean[] visited){
        int count=0;
        for(boolean v : visited){
            if(v) count++;
        }
        return count;
    }
}
