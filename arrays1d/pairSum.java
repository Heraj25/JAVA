package arrays1d;

public class pairSum {

    public boolean check(int[] A, int size , int x) {
        for(int i=0 ; i<size-1 ; i++) {
            for(int j=i+1 ; j<size ; j++) {
                if(A[i]+A[j] == x)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {1, -2, 1,0, 5};
        int x = 0;
        int size = A.length;
        
        pairSum obj = new pairSum();

        if(obj.check(A, size, x)) {
            System.out.println("Yes");
        }
        else
            System.out.println("no");
        
    }
    
}
