package leetcode.group.array;

import java.util.HashMap;

/**
 * @ClassName CountCharactersDemo
 * @Description
 * @Author yk
 * @Date 2020/6/9 10:01
 * @Version 1.0
 **/
public class CountCharactersDemo {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (String word : words) {
            char[] charArray = word.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>(16);
            char[] ch = chars.toCharArray();
            for (char c : ch) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean flag = true;
            for (char c : charArray) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) < 0) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += charArray.length;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
/*        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";*/
        CountCharactersDemo demo = new CountCharactersDemo();
        System.out.println(demo.countCharacters(words, chars));
    }
}
