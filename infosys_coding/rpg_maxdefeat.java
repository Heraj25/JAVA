package infosys_coding;

import java.util.Scanner;
import java.util.Arrays;

//  TIME COMPLEXITY: O(N^2)
// SPACE COMPLEXITY: O(N)

public class rpg_maxdefeat {

    public int defeated_mons(int n, int[] power, int[] bonus, int exp) {
        int defeat_nums = 0;
        int[] reach = new int[n];
        Arrays.fill(reach, 0);
        for(int i=0 ; i<n ; i++) {
            if(reach[i] != 0)
                continue;
            for(int j=0 ; j<n ; j++) {
                if(reach[j] == 0) {
                    if(exp >= power[j]) {
                        exp += bonus[j];
                        ++defeat_nums;
                        reach[j] = 1;
                    }
                    else 
                        continue;        
                }
                else
                    continue;           
            }
            
        }
        return defeat_nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, exp;
        System.out.print("Enter the number of Monsters: ");
        n = sc.nextInt();

        System.out.print("Enter the experience of the fighter: ");
        exp = sc.nextInt();

        int[] power = new int[n];
        int[] bonus = new int[n];
        
        System.out.println("Enter the powers of each monster: ");
        for(int i=0 ; i<n ; i++) 
            power[i] = sc.nextInt();

        System.out.println("Enter the bonus you get after killing each monster: ");
        for(int i=0 ; i<n ; i++) 
            bonus[i] = sc.nextInt();

        rpg_maxdefeat obj = new rpg_maxdefeat();

        System.out.println("The number of defeated monsters: "+ obj.defeated_mons(n, power, bonus, exp));

        sc.close();

    }
}
