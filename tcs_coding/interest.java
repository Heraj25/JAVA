import java.io.*;
import java.util.*;

class Account{
    private int id, balance;
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

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int id = sc.nextInt();
        int balance = sc.nextInt();
        double interestRate = sc.nextDouble();

        //create an object of the account class
        Account acc = new Account(id, balance, interestRate);

        int noOfYears = sc.nextInt();
        double final_interest = calculateInterest(acc, noOfYears);
        System.out.printf("%.3f",final_interest); 
    }

    //new function to calculate the final interest
    public static double calculateInterest(Account acc, int noOfYears) {
        //one single line of code way to do it
        //return (acc.getBalance() * (acc.getInterestRate() +(acc.getInterestRate() * noOfYears)/100.0))/100.0;

        //other way is to declare separate variable and make it simpler
        double percentage = (acc.getInterestRate() * noOfYears)/100.0;

        double total_interestRate = acc.getInterestRate() + percentage;

        double final_interest = (acc.getBalance()*total_interestRate)/100.0;

        return final_interest;
    }
}