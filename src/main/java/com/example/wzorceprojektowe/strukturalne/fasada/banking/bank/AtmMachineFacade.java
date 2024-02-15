package com.example.wzorceprojektowe.strukturalne.fasada.banking.bank;

public class AtmMachineFacade {
    private final AtmMachine atmMachine;
    private final BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public void withdrawMoney(){
        atmMachine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()){
            atmMachine.withdrawCash();
        }else {
            System.out.println("Operacja nie jest ważna");
        }
    }

}
