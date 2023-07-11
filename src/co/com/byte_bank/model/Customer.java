package co.com.byte_bank.model;

import co.com.byte_bank.model.Authenticatable;

import java.util.Objects;

public class Customer implements Authenticatable {
    private String name;
    private String document;
    private String cellphone;
    private String Password;

    public Customer(String password,String Name,String Document){
        this.Password=password;
        this.name=Name;
        this.document=Document;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
