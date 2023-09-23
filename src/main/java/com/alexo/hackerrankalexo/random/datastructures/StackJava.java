package com.alexo.hackerrankalexo.random.datastructures;

import java.util.Stack;

public class StackJava {

    public boolean solution(String input) {
        if(input.length()==1) {
            return  false;
        }
        Stack<Character> charStack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                charStack.push(c);
            } else if (!charStack.isEmpty() && ((c == '}' && charStack.peek() == '{')
                    || (c == ']' && charStack.peek() == '[')
                    || (c == ')' && charStack.peek() == '('))) {
                charStack.pop();
            } else {
                return false;
            }
        }

        return charStack.empty();
    }
}
