package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        System.out.println("______________________________________________");


        while (true){
            try {
                if (bankAccount.getAmount() != 0) {
                    bankAccount.withDraw(6000);
                }
            }catch (LimitException limitException) {
                    try {
                        System.out.println("Остаток на счете составляет " + bankAccount.getAmount());
                        bankAccount.withDraw((int)bankAccount.getAmount());
                        System.out.println("\nВаш остаток на счете " + bankAccount.getAmount());
                    } catch (LimitException e) {
                        System.out.println(e.getMessage());
                    }
            }
        }
    }
}
