public interface Authenticatable {
    String getPassword();
    void setPassword(String Password);
    boolean log_In(String Password);
}
