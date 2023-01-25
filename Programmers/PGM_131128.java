package Programmers;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class PGM_131128 {

    public static void main(String[] args) {

    }

    public static String solution(String X, String Y){
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        List<String> list = new ArrayList<>();

        for(String key : X.split("")){
            xMap.put(key, xMap.getOrDefault(key,0)+1);
        }

        for(String key : Y.split("")){
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }

        for(String key : xMap.keySet()){
            if(!yMap.containsKey(key)) continue;

            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i<length; i++){
                list.add(key);
            }
        }

        String result = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0","").isEmpty()) return "0";
        return result;
    }

    public static String solution2(String X, String Y){
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i =0; i<X.length(); i++){
            x[X.charAt(i)-48] +=1;
        }
        for(int i =0; i<Y.length();i++){
            y[Y.charAt(i)-48] +=1;
        }
        for(int i=9; i>=0; i--){
            for(int j=0; j<Math.min(x[i], y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
            return "-1";
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else{
            return answer.toString();
        }

    }

}
