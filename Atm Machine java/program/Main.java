package com.company;
import java.util.Scanner;

public class Main {    // creating main class
    public static void main(String[] args) {;
        Interf op=new Implement();  //Calling interface and implments class in main class
        int atmnumber=12345;      //input number
        int atmpin=123;            // input pin
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");  //Display
        System.out.print("Enter Atm Number : ");
        int atmNumber=in.nextInt();      //take user input correct or not
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();    //take user input correct pin or not
        if((atmnumber==atmNumber)&&(atmpin==pin)){    // if both are correct then
            while(true){       //then perform this work
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Transaction History\n5.Exit");
                System.out.println("Enter Choice What to do-: ");
                int ch=in.nextInt();  // take user choice
                if(ch==1){

                   op.viewBalance();    //calling method
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                   op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.transactionHistory();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}