package co.com.byte_bank.model;

public interface Authenticatable {
    String getPassword();
    void setPassword(String Password);
    boolean log_In(String Password);
}
