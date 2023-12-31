package solution.level1;

import java.util.Objects;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
public class _08_count_of_py {
    boolean solution(String s) {
        String temp = s.toLowerCase();
        String[] letters = temp.split("");
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (Objects.equals(letters[i], "p")) countP++;
            if (Objects.equals(letters[i], "y")) countY++;
        }
        return countP == countY;
    }
}
