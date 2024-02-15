package arrays1d;

public class bintodec_rev {
    public static void main(String[] args) {
        int dec = 35;
		int bin = 0;
		int rem = 0;
		while(dec > 0) {
		    rem = dec%2;
		    bin = rem+ bin*10;
		    dec = dec/2;
		}
		
		System.out.print("The binary version of the number : "+bin);
    }   
}
