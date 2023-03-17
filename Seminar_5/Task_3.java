package Seminar_5;
// проверить, что бы скобки в выражении стояли правильно
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_3 {
    public static boolean isRight(String str){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : str.toCharArray()){
            if (map.containsKey(c)){
                stack.add(c);
            }

            for (Map.Entry<Character, Character> entry : map.entrySet()){
                if (c == entry.getValue()){
                    if (!stack.isEmpty() && stack.peek() == entry.getKey())
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isRight("[(6+{3*3})]"));
    }

}
