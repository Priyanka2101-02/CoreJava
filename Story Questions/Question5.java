/*
 * Problem Statement
Gaffur is a class teacher in school. He is calculating the attendance score of one student in below
way:
• He will make a string of only characters('0', '1', '2').
• He append '2' to the string, if the student is present for that day.
• He append '1' to the string, if the student is absent with permission for that day.
• He append '0' to the string, if the student is absent without permission for that day.
You are asked to find the total number of ways the string can be formed for a student for n days.
Input Format
• First and the only line will be the integer n.
Constraints
• (1 <= n <= 10^5)
Output Format
• Output the answer of problem by taking modulo with 1e9 + 7.

 Explanation
Six different string are:
00
01
02
10
11
12
20
21
22
input
2
output 
9


 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        final int MOD = 1000000007;

        // Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Initialize an array to store the number of ways for each choice ('0', '1', '2') for each day.
        long[] dp = new long[3];

        // Initialize the base cases.
        dp[0] = 1; // No days, no choices
        dp[1] = 1; // No days, choice '1' (absent with permission)
        dp[2] = 1; // No days, choice '2' (present)

        // Fill the DP array.
        for (int i = 1; i <= n; i++) {
            long new0 = (dp[0] + dp[1] + dp[2]) % MOD; // '0' can be appended to any previous choice
            long new1 = dp[0]; // '1' can only be appended to '0'
            long new2 = dp[1]; // '2' can only be appended to '1'

            dp[0] = new0;
            dp[1] = new1;
            dp[2] = new2;
        }

        // Calculate and output the result modulo 1e9 + 7
        long result = (dp[0] + dp[1] + dp[2]) % MOD;
        System.out.println(result);
    }
}

