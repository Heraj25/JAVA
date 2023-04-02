package arrays1d;


import java.util.*;
import java.util.Scanner;

class GFG{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        int t = sca.nextInt();
        while(t-->0){
            int N = sca.nextInt();
            factorialList ob = new factorialList();
            ArrayList<Integer> ans = ob.factorial(N);

            for(Integer val: ans)
                System.out.print(val);
            System.out.println();
        }
        sca.close();
    }
}

class factorialList{
    public static ArrayList<Integer> factorial(int N) {
        int[] res = new int[10000]; // initialize result array
        res[0] = 1; // initialize result with 1

        int resSize = 1; // keep track of number of digits in result

        for (int i = 2; i <= N; i++) {
            int carry = 0;

            for (int j = 0; j < resSize; j++) {
                int prod = res[j] * i + carry;
                res[j] = prod % 10;
                carry = prod / 10;
            }

            while (carry > 0) {
                res[resSize++] = carry % 10;
                carry /= 10;
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = resSize - 1; i >= 0; i--) {
            result.add(res[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> res = factorial(N);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }

        sc.close();
    }
}

