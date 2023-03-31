package arrays1d;
import java.util.Scanner;
public class buyandsell {
    
        public int maxProfit(int[] prices) {
            int low = prices[0];
            int l=0;
            int high=0;
            for(int i=1 ; i<prices.length ; i++){
                if(prices[i] < low){
                    low = prices[i];
                    l=i;
                    //System.out.println(low);
                }  
               
            }
    
            int temp =low;
    
            for(int i = l+1 ; i<prices.length ; i++){
                if(prices[i] > temp){
                        high = prices[i];
                        //System.out.println("HIGH:" +high);
                        temp = high;
                }
            }
    
            int profit;
            if(high != 0){
                profit = high - low;
                return profit;
            }
    
            else{
                return 0;
            }
    
        }
                
       
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
    
            int[] arr = new int[n];
    
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
    
            buyandsell obj = new buyandsell();
            System.out.print(obj.maxProfit(arr));
    
            sc.close();
        }
    }
    
