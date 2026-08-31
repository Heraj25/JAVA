package tcs_coding;

/*
 * 
 * Problem Statement -:  Given two non-negative integers n1 and n2, where n1

For example: Suppose n1=11 and n2=15.

There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

Example1:

Input:

11 — Vlaue of n1
15 — value of n2
Output: 4

Example 2:

Input:

101 — value of n1
200 — value of n2
Output: 72
 */


public class no_repeat_digits {
    static int find(int n1, int n2) {
        int count = 0;

        for(int i=n1 ; i<= n2 ; i++) {
            if(hasuniquedigits(i)) {
                ++count;
            }
        }
        return count;
    }

    static boolean hasuniquedigits(int num) {
        boolean[] visited = new boolean[10];

        while(num > 0) {
            int digit = num%10;
            if(visited[digit]) {
                return false;
            }
            visited[digit] = true;
            num = num/10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 101, n2 = 200;
        System.out.println(find(n1, n2));
    }
        
}
