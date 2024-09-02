package com.mycompany.assignment2;

import java.util.Scanner;

public class BankDetail {
       private String accountNumber;
       private String name;
       private String accountType;
       private double balance;
       
       Scanner sc = new Scanner(System.in);
       
       public void getOpenAccount(){
           System.out.println("Enter Account Number = ");
           accountNumber = sc.next();
           
           System.out.println("Enter Account Type = ");
           accountType = sc.next();
           
           System.out.println("Enter Name = ");
           name = sc.next();
           
           System.out.println("Enter Balance = ");
           balance = sc.nextDouble();
       }
       
       public void getShowAccount(){
           System.out.println("Name of the account holder = "+name);
           System.out.println("Account Number = "+accountNumber);
           System.out.println("Account Type = "+accountType);
           System.out.println("Balance = "+balance);
       }
       
       public void getDeposite(){
           double amount;
           System.out.println("Enter the amount you want to deposite..");
           amount = sc.nextDouble();
           balance = balance + amount;
       }
       
       public void getWithdrawl(){
           double amount;
           System.out.println("Enter the amount you want to withdraw..");
           amount = sc.nextDouble();
           if(balance >= amount){
               balance = balance - amount;
               System.out.println("Balance after withdrawl = "+balance);
           }
           else{
               System.out.println("Your Balance is less than "+amount +"\t Transaction faild..!!");
               
           }
       }
       
       public boolean getSearch(String accountNumber){
           if(accountNumber.equals(accountNumber)){
               getShowAccount();
               return (true);
           }
           return (false);
       }
       
}
