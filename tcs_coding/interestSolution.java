package tcs_coding;

import java.util.Scanner;

class Account{
    private int id;
    private int balance;
    private double interestRate;

    //constructor
    Account(int id, int balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    //getters
    public int getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
}

public class interestSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int balance = sc.nextInt();
        double interestRate = sc.nextDouble();

        Account acc = new Account(id, balance, interestRate);
        sc.nextLine();
        int noOfYears = sc.nextInt();
        double final_interest = calculateInterest(acc, noOfYears);

        System.out.printf("%.3f", final_interest);

        sc.close();
    }

    public static double calculateInterest(Account acc, int noOfYears) {
        double percentage = acc.getInterestRate() * noOfYears / 100.0;
        double finalinterestRate = acc.getInterestRate() + percentage;

        double final_interest = acc.getBalance()*finalinterestRate/100.0;

        return final_interest;
    }
}
