package strings;

public class findnums {

    static long max(String str) {
        String[] S = str.split(" ");
        long max = 0;

        for(String words: S) {
            if(Character.isDigit(words.charAt(0)) && !words.contains("9")) {
                max = Math.max(Long.parseLong(words), max);
            }
        }

        if(max == 0)
            return -1;
        
        return max;
    }

    public static void main(String[] args) {
        String str = "I am Heraj with my roll no 500084895 and i am number 1 in mmy class.";
        
        System.out.println("The maximum number present in tht String: "+max(str));
    }
    
}
