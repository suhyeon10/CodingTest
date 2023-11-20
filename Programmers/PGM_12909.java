package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PGM_12909 {
    boolean solution(String s) {
        boolean answer = true;

        Queue<Character> queue = new LinkedList<>();

        for(char c : s.toCharArray() ){
            if(queue.size()>0 && queue.peek()=='(' && c == ')'){
                queue.remove();
            }else{
                queue.add(c);
            }

        }
        if(queue.size()>0) return false;
        else return true;

    }
}
