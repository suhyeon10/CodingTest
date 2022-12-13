package Programmers;

import java.util.Stack;

public class PMG_133502 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
    public static int solution(int[] ingredient){
        Stack<Integer> ingredients = new Stack<>();
        int count = 0;
        for (int i = 0; i < ingredient.length; i++){
            ingredients.push(ingredient[i]);
            int size = ingredients.size();
            if (size > 3 && ingredients.peek() == 1
            && ingredients.get(size-2) == 3
            && ingredients.get(size-3) == 2
            && ingredients.get(size-4) == 1){
                packaging_buger(ingredients);
                count++;
            }
        }

        return count;
    }

    public static void packaging_buger(Stack<Integer> ingredients){
        ingredients.pop();
        ingredients.pop();
        ingredients.pop();
        ingredients.pop();
    }
}
