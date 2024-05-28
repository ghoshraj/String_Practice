package string;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(balanced("{}{})[]"));
    }
    static boolean balanced(String s){
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if (a == '{' || a == '[' || a == '('){
                stack.push(a);
            }
            else if (a == '}' || a == ']' || a == ')'){
                if (stack.isEmpty() || !pair(stack.pop(),a))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean pair(char c1, char c2){
        if (c1 == '(' && c2 == ')')return true;
        if (c1 == '{' && c2 == '}')return true;
        if (c1 == '[' && c2 == ']')return true;
        return false;
    }
}
