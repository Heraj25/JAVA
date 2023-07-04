package leetcode;
import java.util.Arrays;
import java.util.Scanner;

class median {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = n+m;
        int[] newarr = new int[l];
        int k=0;
        for(int i=0 ; i<l; i++){
            if(i<n){
                newarr[i] = nums1[i];
            }
            if(i>=n && k<m){
                newarr[i] = nums2[k++];
            }

        }

        Arrays.sort(newarr);
        for(int i=0 ; i<l ; i++){
            System.out.print(newarr[i]+" ");
        }
        int a = l/2;
        int sum=0;
        if(l%2 == 1){
            return newarr[a];
        }
        else{
            sum = newarr[a]+newarr[a-1];
            System.out.println(sum/2);
        }
        return sum/2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for(int i=0 ; i<n ; i++){
            nums1[i] = sc.nextInt();

        }

        for(int j=0 ; j<m ; j++){
            nums2[j] = sc.nextInt();
        }

        System.out.println(findMedianSortedArrays(nums1, nums2));
        sc.close();

    }
}
