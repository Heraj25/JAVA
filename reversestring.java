import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        String str1 = "todayistheday";
        String str2 = "eht";

        int i = str2.length();
        String str3 = "";

        for (int j = i - 1; j >= 0; j--) {
            str3 = str3 + str2.charAt(j);
        }

        System.out.println(str3);

    }
}
