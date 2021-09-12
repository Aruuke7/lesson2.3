package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
       amount += sum;
        System.out.println("Вы пополнили счет на " + sum);
        System.out.println("Ваш баланс составляет " + amount);
    }

    public void withDraw (int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("У вас недостаточно средств на счете", amount);
        }
        amount -=sum;
        System.out.println("Вы сняли со счета: "+ sum);
    }
}
