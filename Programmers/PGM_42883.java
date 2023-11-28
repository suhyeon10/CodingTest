package Programmers;

import java.util.Stack;
import java.util.stream.Collectors;

public class PGM_42883 {
    public String solution(String number, int k) {
        String answer = "";
        String[] numList = number.split("");

        Stack<Character> stack = new Stack<>();

        for(char c: number.toCharArray()){
            while(k>0 && !stack.isEmpty() && c>stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k-- > 0){
            stack.pop();
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
