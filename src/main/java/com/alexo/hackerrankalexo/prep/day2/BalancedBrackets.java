package com.alexo.hackerrankalexo.random.datastructures;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return "NO";  // There's a closing bracket without an opening one
                }
                char top = stack.pop();
                if (c == '}' && top != '{') {
                    return "NO";
                }
                if (c == ']' && top != '[') {
                    return "NO";
                }
                if (c == ')' && top != '(') {
                    return "NO";
                }
            }
        }
        return (stack.isEmpty()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        /**
         * {[()]}
         * {[(])}
         * {{[[(())]]}}
         * {{([])}}
         * {{)[](}}
         * {(([])[])[]}
         * {(([])[])[]]}
         * {(([])[])[]}[]
         */
        System.out.println(isBalanced("{[()]}")); // yes
        System.out.println(isBalanced("{[(])}")); // no
        System.out.println(isBalanced("{{[[(())]]}}")); // yes
        System.out.println(isBalanced("{{([])}}")); // yes
        System.out.println(isBalanced("{{)[](}}")); // no
        System.out.println(isBalanced("{(([])[])[]}")); // yes
        System.out.println(isBalanced("{(([])[])[]]}")); // no
        System.out.println(isBalanced("{(([])[])[]}[]")); // yes
    }
}
