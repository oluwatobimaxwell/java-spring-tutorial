package com.family_members.app;

public class Account {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Account(String accountHolderName, String accountNumber, double initialBalance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        if(initialBalance<0){
            this.balance=0;
        }else {
            this.balance=initialBalance;
        }
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance=this.balance+amount;
            this.displayAccountInfo();
        } else {
            System.out.println("Invalid Amount - Amount must be greater than zero");
        }

    }

    public void withdraw(double amount){
        if(amount>0){
            if(this.balance>=amount){
                this.balance=this.balance-amount;
                this.displayAccountInfo();
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid Amount - Amount must be greater than zero");
        }

    }

    public double getBalance(){
        return this.balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder Name: "+ this.accountHolderName);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Account Balance: "+ this.balance);
    }


}
