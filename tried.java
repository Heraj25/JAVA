import java.util.*;

public class tried {
    public static void main(String[] args) {
        int sum = 101;
        int remainder = 0;
        int i = 0;
        int output = 0;
        while (sum > 0) {
            remainder = sum % 10;
            sum = sum / 10;
            if (remainder == 1) {
                output += Math.pow(2, i);
            }

            System.out.println(output);
            i++;
        }

        // System.out.println(output);
    }
}