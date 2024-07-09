package infosys_coding.optimized;

import java.util.Scanner;

//TIME COMPLEXITY: O(N)
//SPACE COMPLEXITY: O(N)

public class rpg_maxdefeat_optimized {

    public int defeatedMonsters(int n, int[] power, int[] bonus, int exp) {
        int defeatNums = 0;
        boolean[] defeated = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int maxBonusIndex = -1;
            int maxBonus = Integer.MIN_VALUE;
            
            for (int j = 0; j < n; j++) {
                if (!defeated[j] && exp >= power[j] && bonus[j] > maxBonus) {
                    maxBonus = bonus[j];
                    maxBonusIndex = j;
                }
            }

            if (maxBonusIndex != -1) {
                exp += maxBonus;
                defeated[maxBonusIndex] = true;
                defeatNums++;
            }
        }
        return defeatNums;
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
        for (int i = 0; i < n; i++) 
            power[i] = sc.nextInt();

        System.out.println("Enter the bonus you get after killing each monster: ");
        for (int i = 0; i < n; i++) 
            bonus[i] = sc.nextInt();

        rpg_maxdefeat_optimized obj = new rpg_maxdefeat_optimized();

        System.out.println("The number of defeated monsters: " + obj.defeatedMonsters(n, power, bonus, exp));

        sc.close();
    }
}
