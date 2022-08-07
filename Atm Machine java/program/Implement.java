package com.company;
import java.util.HashMap;
import java.util.Map;

    public class Implement implements Interf{
        ATM atm=new ATM();    // create object of the Atm class
        Map<Double,String> ministmt=new HashMap<>();
        @Override
        public void viewBalance() {
            System.out.println("Available Balance is : "+atm.getBalance());

        }

        @Override
        public void withdrawAmount(double withdrawAmount) {
            if(withdrawAmount%500==0) {
                if (withdrawAmount <= atm.getBalance()) {
                    ministmt.put(withdrawAmount, " Amount Withdrawn");
                    System.out.println("Collect the Cash " + withdrawAmount);
                    atm.setBalance(atm.getBalance() - withdrawAmount);
                    viewBalance();
                } else {
                    System.out.println("Insufficient Balance !!");
                }
            }
            else {
                System.out.println("Please enter the amount in multipal of 500");
            }

        }

        @Override
        public void depositAmount(double depositAmount) {
            ministmt.put(depositAmount," Amount Deposited");
            System.out.println(depositAmount+" Deposited Successfully !!");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewBalance();

        }

        @Override
        public void transactionHistory() {
            for(Map.Entry<Double,String> m:ministmt.entrySet()){
                System.out.println(m.getKey()+""+m.getValue());
            }

        }
    }

