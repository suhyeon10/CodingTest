package Programmers;

import java.util.HashMap;
import java.util.Map;

public class PGM_42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothMap = new HashMap<>();

        for(String[] cloth : clothes){
            clothMap.compute(cloth[1], (key, value) -> (value == null) ? 1 : value+1);
        }
        return clothMap.values().stream().map( clothCnt -> clothCnt+1).reduce(1,(a,b)-> a*b) -1;

    }
}
