package co.com.byte_bank.model;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
