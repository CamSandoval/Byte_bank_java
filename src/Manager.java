import java.util.Objects;

public class Manager extends Authenticatable_employee{

    public Manager(String password) {
        super.setPassword(password);
    }
    public double getBonus(){
        return super.getSalary() +super.getSalary()*0.1;
    }
}
