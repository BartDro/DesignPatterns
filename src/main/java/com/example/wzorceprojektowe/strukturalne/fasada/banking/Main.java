package com.example.wzorceprojektowe.strukturalne.fasada.banking;

import com.example.wzorceprojektowe.strukturalne.fasada.banking.bank.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade facade = new AtmMachineFacade();
        facade.withdrawMoney();
    }
}
