package recursion;

public class practiceRec1 {

  static void printNums(int n) {
    if (n == 0) return;
    printNums(n - 1);
    System.out.println(n);
  }

  static void printSumOfNaturals(int i, int n, int sum) {
    if (i > n) {
      System.out.println("Sum of " + n + " natural nummbers is: " + sum);
      return;
    }

    printSumOfNaturals(i + 1, n, sum + i);
    // System.out.println("Sum: " + sum);
  }

  static int factorial(int n) {
    if (n == 1 || n == 0) return 1;

    return n * factorial(n - 1);
  }

  // Print fibonacci series till nth term
  static void fibonacciSeries(int a, int b, int n, int sum) {
    if (n == 0) {
      System.out.println("Sum of the Fibonacci series: " + sum);
      return;
    }

    System.out.println(a + b);
    fibonacciSeries(b, a + b, n - 1, sum + a + b);
  }

  //   Print x ^ n where n ----  stack height is equivalent to number of levels in the stack
  static double calcPower(int x, int n) {
    if (x == 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    }

    return x * calcPower(x, n - 1);
  }

  // Optimize the above recursion function where the stack height becomes --- log n

  static int calcPowerLogn(int x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;
    if (
      n % 2 == 0 // if power is an even number
    ) return calcPowerLogn(x, n / 2) * calcPowerLogn(x, n / 2);
    // if power is an odd number
    else return calcPowerLogn(x, n / 2) * calcPowerLogn(x, n / 2) * x;
  }

  public static void main(String[] args) {
    int n = 5;

    printNums(n);
    printSumOfNaturals(0, n, 0);
    System.out.println(factorial(5));
    fibonacciSeries(0, 1, 5, 0 + 1);
    System.out.println(calcPower(5, 2)); // recursion inefficient where height of the stack is the number of levels n
    System.out.println(calcPowerLogn(5, 2)); // recursion optimised where height of the stack is log n
  }
}
