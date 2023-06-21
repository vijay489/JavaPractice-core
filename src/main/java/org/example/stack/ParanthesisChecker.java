package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        Deque<Character> s = new ArrayDeque<>();
        String str = "[({{}})]";

        boolean balance = isBalancedBraces(s, str);
        System.out.println("Is Balanced brackets : " +balance);
    }

    private static boolean isBalancedBraces(Deque<Character> s, String str) {
        for(char ch : str.toCharArray()) {
             if(ch == '{' || ch =='[' ||ch == '('){
                 s.push(ch);
                 continue;
             }

             if(s.isEmpty())
                 return false;

             char check ;
             switch (ch){
                 case ')' :
                     check = s.pop();
                     if(check == '{' || check == '[')
                         return false;
                     break;
                 case ']' :
                     check = s.pop();
                     if(check == '(' || check == '{')
                         return false;
                     break;
                 case '}':
                     check = s.pop();
                     if(check =='(' || check == '[')
                         return false;
                     break;
             }
        }
        return s.isEmpty();
    }
}
