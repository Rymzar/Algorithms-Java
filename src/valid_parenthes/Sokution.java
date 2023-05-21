package valid_parenthes;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/

/*
* Version #1
* С использование Stack
*/

public class Sokution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('<', '>');
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        /*Класс Stack в Java – это структура данных, которая следует за LIFO (Last In First Out).
        Java Stack Class подпадает под базовую платформу Collection Hierarchy Framework,
        в которой вы можете выполнять базовые операции, такие как push, pop и т. д.*/
        Stack<Character> stack = new Stack<>();

        for (char sh : s.toCharArray()) {
            if (map.containsKey(sh)) {
                stack.push(sh);
            } else if (!stack.empty() && map.get(stack.peek()) == sh) {
                stack.pop();
            } else return false;
        }

        return true;
    }
}
