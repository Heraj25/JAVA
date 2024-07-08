package infosys_coding;

import java.util.Scanner;

public class bitwiseSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of elements in the array (N): ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findAndPrintLongestSubsequence(n, arr);

        sc.close();
    }

    public static void findAndPrintLongestSubsequence(int n, int[] arr) {
        int maxLength = 0;
        int endIdx = 0;

        for (int i = 0; i < n; i++) {
            int currentLength = 1;

            for (int j = i + 1; j < n; j++) {
                if ((arr[j - 1] & arr[j]) * 2 < (arr[j - 1] | arr[j])) {
                    currentLength++;
                } else {
                    break;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                endIdx = i;
            }
        }

        System.out.println("Length of the longest subsequence: " + maxLength);
        System.out.println("One possible subsequence is:");
        for (int i = endIdx; i < endIdx + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
