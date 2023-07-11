package co.com.byte_bank.model;

import co.com.byte_bank.model.Authenticatable;

public class Internal_system {
    //private String password = "1234";
    public boolean authenticate(Authenticatable manager, String password){
        boolean can_log_in = manager.log_In(password);
        if(can_log_in){
            System.out.println("Login successfully");
            return true;
        }else{
            System.out.println("Invalid login");
            return false;
        }
    }
}
