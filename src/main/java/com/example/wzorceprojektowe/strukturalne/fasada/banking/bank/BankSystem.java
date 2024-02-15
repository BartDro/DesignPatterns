package com.example.wzorceprojektowe.strukturalne.fasada.banking.bank;

class BankSystem {
    void transferMoney() {
        System.out.println("Money has beend transfered");
    }

    boolean validatePin() {
        System.out.println("Pin is valid");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transaction is valid");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("History is being taken");
    }
}
