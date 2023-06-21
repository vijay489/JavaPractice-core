package org.example.stack;

import java.awt.*;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String str = "(()()(";
        longestValidParentheses(str);
    }

    private static void longestValidParentheses(String str) {
        Stack<Integer> stack =new Stack<>();
        int max = 0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch == '('){
                stack.push(i);
            } else{
                if(!stack.isEmpty())
                     stack.pop();

                if(!stack.isEmpty())
                   max = Math.max(max,i-stack.peek());
                else
                    stack.push(i);
            }
        }
        System.out.println(max);
    }
}
