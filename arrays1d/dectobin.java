package arrays1d;


public class dectobin
{
	public static void main(String[] args) {
		int b = 1101;
		
		int dec = 0;
		int temp=0;
		int n=0;
        while(b>0) {
            temp = b%10;
            dec = dec + (int)(temp*Math.pow(2,n));
            b = b/10;
            n++;
        }
        
        System.out.print("The decimal number is:"+dec);
	}
}
