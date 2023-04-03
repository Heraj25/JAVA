package arrays1d;

import java.util.*;
class successpairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       /* 
        int[] out = new int[spells.length];
        long pro;
        if(spells.length>=1 && potions.length<=100000){
            for(int i=0 ; i<spells.length ; i++){
                int count=0;
                for(int j=0; j<potions.length ; j++){
                    if(spells[i]>=1 && potions[j]<=100000){
                        pro = (long)spells[i]*potions[j];
                        if(success>=1 && success<=100000){
                            if(pro >= success){
                                count = count+1;
                            }
                        }
                    }
                }
                out[i] = count;
            }
        }

        return out;
        */
        /*
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((long) spells[i] * potions[j] >= success) {
                    pairs[i]++;
                }
            }
        }
        return pairs;
        */

        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions); // Sort the potions array in Ascending order
        
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = m - 1;
            int count=0;
            while (l <= r) {
                count = 0;
                int mid = l + ((r - l) / 2);
                if ((long) spells[i] * potions[mid] >= success) {
                    count += m - mid; // All the potions from mid to m-1 form a successful pair
                    System.out.println(pairs[i]);
                    r = mid - 1; // Look for a smaller index to see if there are more successful pairs
                } else {
                    l = mid + 1; // Look for a larger index to see if there are any successful pairs
                }
            }
            pairs[i] = count;
        }
        
        return pairs;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] spells = new int[n];
        int[] potions = new int[m];

        for(int i=0; i<n ; i++){
            spells[i] = sc.nextInt();
        }

        for(int j=0; j<m ; j++){
            potions[j] = sc.nextInt();
        }

        int success = sc.nextInt();

        successpairs obj = new successpairs();
        System.out.print(obj.successfulPairs(spells, potions, success));
    }
}