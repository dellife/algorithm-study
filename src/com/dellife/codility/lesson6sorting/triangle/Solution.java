package com.dellife.codility.lesson6sorting.triangle;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 20};
        int[] B = {10, 50, 5, 1};
        int a = solution(A);
        System.out.println(a);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;
        if (length < 3) {
            return 0;
        }

        Arrays.sort(A);
        for (int i = 0; i < length - 2; i++) {

            if ((long) A[i] + (long) A[i + 1] > (long) A[i + 2]) {
                return 1;
            }
        }

        return 0;
    }

}
