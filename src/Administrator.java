import java.util.Objects;

public class Administrator extends Employee implements Authenticatable{
    private String Password;

    public Administrator(String password){
        this.Password = password;
    }
    @Override
    public double getBonus() {
        return super.getSalary()*0.5;
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
