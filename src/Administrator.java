import java.util.Objects;

public class Administrator extends Authenticatable_employee{

    public Administrator(String password){
        super.setPassword(password);
    }
    @Override
    public double getBonus() {
        return super.getSalary()*0.5;
    }
}
