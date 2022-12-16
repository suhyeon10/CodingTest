package Programmers;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;
import java.util.Map;

public class PGM_131127 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
        System.out.println(solution(new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }
    final static int MAX_DATE = 10;
    public static int solution(String[] want, int[] number, String[] discount){
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> discountMap = new HashMap<>();

        for(int i = 0; i<want.length; i++){
            wantMap.put(want[i], number[i]);
        }

        for(int i =0; i<MAX_DATE; i++){
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0)+1);
        }

        if(isEqual(wantMap, discountMap)){
            answer++;
        }

        for(int i=1; i<=discount.length - MAX_DATE; i++){
            String deleteItem = discount[i-1];
            discountMap.put(deleteItem, discountMap.get(deleteItem)-1);

            String addItem = discount[i -1 + MAX_DATE];
            discountMap.put(addItem, discountMap.getOrDefault(addItem, 0)+1);

            if(isEqual(wantMap, discountMap)){
                answer++;
            }

        }


        return answer;
    }

    public static boolean isEqual(Map<String, Integer> wantMap, Map<String, Integer> compareMap){
        for(String key: wantMap.keySet()){
            if(!compareMap.containsKey(key) || wantMap.get(key)!=compareMap.get(key)){
                return false;
            }
        }
        return true;
    }

}
