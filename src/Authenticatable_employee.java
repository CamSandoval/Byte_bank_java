import java.util.Objects;

public abstract class Authenticatable_employee extends Employee{
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password){
        this.password = Password;
    }
    public boolean log_In(String Password){
        return Objects.equals(this.password, Password);
    }

    public abstract double getBonus();
}
