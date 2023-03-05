import java.util.Scanner;
public class expect_path {
    int solve(int A) {
        int step=0;
        Scanner scan = new Scanner(System.in);
        
        int x = A;
       
        int y;
        y = scan.nextInt();
        int b=0;
        if(y > 0){
            if(x!=1){
                x = x/y;
                step++;
            }
            else{
                b = (int)(x*(Math.pow(y,-1))%(Math.pow(10,9)+7));
            }
        }
        
        return b;
    }

    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        expect_path obj = new expect_path();
        
        System.out.println(obj.solve(a));
    }
}


