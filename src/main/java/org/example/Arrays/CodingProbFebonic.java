package org.example.Arrays;

public class CodingProbFebonic {

    public static void main(String[] args) {
        int limit = 10;
        int a = 0;

        int b = 1;
        int counter = 0;

        while(counter < limit && a < limit) {
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
            counter = counter +1;

        }
    }
}

//0,1,1,2,3,5,8
