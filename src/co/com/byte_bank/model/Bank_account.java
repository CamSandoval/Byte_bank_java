package co.com.byte_bank.model;

import co.com.byte_bank.model.Account;

public class Bank_account extends Account {
    public Bank_account(int Agency){
        super(Agency);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            this.balance =this.balance +amount;
        }else{
            System.out.println("You don't make a deposit with a negative number");
        }
    }
}
