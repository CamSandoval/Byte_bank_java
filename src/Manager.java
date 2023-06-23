import java.util.Objects;

public class Manager extends Employee{
    private String password;
    public Manager(){

    }

    public void setPassword(String Password){
        this.password = Password;
    }
    public boolean log_In(String Password){
        return Objects.equals(this.password, Password);
    }
    public double getBonus(){
        return super.getSalary() +super.getBonus();
    }
}
