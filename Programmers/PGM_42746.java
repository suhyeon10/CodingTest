package Programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PGM_42746 {
    public String solution(int[] numbers) {
        String answer = "";

        return Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted( (s1,s2) ->{
                    int origin = Integer.parseInt(s1+s2);
                    int reverse = Integer.parseInt(s2+s1);
                    return reverse-origin;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");

    }
}
