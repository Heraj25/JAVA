public class rec_max {

    static int recur_max(int array, int n, int i) {
        int max;
        if (n < 1)
            return 0;
        if (array < max)
            recur_max(arr[i + 1], max, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 9, 1 };
        int n = arr.length;
        int i = 0;
        System.out.println(recur_max(arr[i], n, i));
    }

}
