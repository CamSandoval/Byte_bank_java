package co.com.byte_bank.model;

import co.com.byte_bank.model.Authenticatable;
import co.com.byte_bank.model.Employee;

import java.util.Objects;

public class Manager extends Employee implements Authenticatable {
    private String Password;

    public Manager(String password) {
        this.Password = password;
    }
    @Override
    public double getBonus(){
        return super.getSalary() +super.getSalary()*0.5;
    }

    @Override
    public String getPassword() {
        return this.Password;
    }

    @Override
    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public boolean log_In(String password) {
        return Objects.equals(this.Password, password);
    }
}
