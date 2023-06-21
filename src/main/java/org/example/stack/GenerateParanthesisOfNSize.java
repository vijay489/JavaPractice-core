package org.example.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesisOfNSize {

    public static void main(String[] args) {
        int n = 3;
        generateParanthesis(n);
    }

    private static void  generateParanthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        generate(res,sb,n,n);
        System.out.println("Result : "+res);
    }

    private static void generate(List<String> result, StringBuffer s, int open, int close) {
      if(open == 0 && close == 0)
      {
          result.add(s.toString());
          return;
      }

      if(open > 0){
        s.append("(");
        generate(result,s,open-1,close);
        s.deleteCharAt(s.length() - 1);
      }

      if(open < close){
          s.append(")");
          generate(result,s,open,close-1);
          s.deleteCharAt(s.length()-1);
      }
    }
}
