package tcs_coding;

import java.util.*;

public class smallest_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = str.charAt(0);
        for(int i=1 ; i<str.length() ; i++) {
            if(ch > str.charAt(i))
                ch = str.charAt(i);
        }

        System.out.println(ch);
        sc.close();
    }
}
