package Programmers;

import java.util.*;

public class PMG_138476 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1,3,2,5,4,5,2,3}));
        System.out.println(solution(4, new int[]{1,3,2,5,4,5,2,3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));

    }
    public static int solution(int k, int[] tangerine){
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int tangerineNum : tangerine){
            map.put(tangerineNum, map.getOrDefault(tangerineNum, 0)+1);
        }

        List<Integer> keylist = new ArrayList<>(map.keySet());
        Collections.sort(keylist, new CustomComparator(map));

        for(Integer key : keylist){
            if(k<=0){
                break;
            }
            k-=map.get(key);
            answer++;
        }
        return answer;
    }

    public static class CustomComparator implements Comparator<Integer> {

        Map<Integer, Integer> map;
        public CustomComparator(Map<Integer, Integer> map){
            this.map = map;
        }
        @Override
        public int compare(Integer o1, Integer o2) {
            return map.get(o2).compareTo(map.get(o1));
        }
    }
}
