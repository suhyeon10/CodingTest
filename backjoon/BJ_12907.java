package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_12907 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[] animal = new int[N];
        int[] animalIdx = new int[41];

        // 입력값 초기화
        st =  new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            animal[i] = Integer.parseInt(st.nextToken());
            animalIdx[animal[i]]++;
        }
        int sum = 0;
        int result = 1;
        boolean findOne = false;

        for(int i =0; i<N; i++) {
            if(animalIdx[i] == 2) {
                if(!findOne) result *=2;
                else break;
            }else if(animalIdx[i] ==1) {
                findOne = true;
            }else {
                break;
            }
            sum += animalIdx[i];
        }
        if(findOne) result *= 2;
        if(sum != N) result = 0;
        System.out.println(result);

    }
}
