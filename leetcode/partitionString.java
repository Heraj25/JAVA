/*
 2405. Optimal Partition of String
Medium
1.6K
69
Companies
Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.

 

Example 1:

Input: s = "abacaba"
Output: 4
Explanation:
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
Example 2:

Input: s = "ssssss"
Output: 6
Explanation:
The only valid partition is ("s","s","s","s","s","s").
 

Constraints:

1 <= s.length <= 105
s consists of only English lowercase letters.
 */


package leetcode;

import java.util.*;

public class partitionString {
    public int partString(String s) {
        int count = (s.isEmpty()) ? 0 : 1;
        s = s.toLowerCase();
        HashSet<Character> letters = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) {
                letters.clear();
                count++;
            }
            letters.add(s.charAt(i));
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        partitionString obj = new partitionString();
        System.out.println(obj.partString(str));

        sc.close();

    }   
}
