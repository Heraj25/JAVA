package tcs_coding;

public class cyclic_rotation {
    
    static int[] rotate(int[] arr,int n, int k) {

        //  TIME COMPLEXITY : O(N)
        //  APPROACH
        //instead of doing cyclic rotation create a temporary array containing the k elements ending in the array
        // shift the first n-k elements at the left of the array to the right in the same order
        // print the temp array elements in the left of the original array

        int[] ans = new int[n];

        if(k>n) 
            k = k%n;

        if(k==0)
            return arr;

        //shift the k elements from the right of the array to the temporary array
        int[] temp = new int[k];
        for(int i=0 ; i<k ; i++)
            temp[i] = arr[n-k+i];
        
        //shift the elements in the left of the original array to the right of the array in the same order
        for(int i=n-1 ; i>=k ; i--)
            ans[i] = arr[i-k];

        //print the temp array elements in the same order in the original array in the same order
        for(int i=0 ; i<k ; i++) 
            ans[i] = temp[i];


        return ans;
        
    }


    public static void main(String[] args) {
        int Array[] = { 1, 2, 3, 4, 5 };
        int N = 5;
        int K = 2;
        
        int[] ans = rotate(Array, N, K);
        for (int i = 0; i < N; ++i) {
            System.out.println(ans[i]);
        }
    }
        
}