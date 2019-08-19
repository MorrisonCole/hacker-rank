package com.morrisoncole.solutions.hackerrank.skills.java.strings.stringreverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
