public class Test_Employee {
    public static void main(String[] args) {
        //test employee

        //we will change the data type of diego, because we convert employee into an abstract class
        //Employee diego = new Employee();
        Accountant diego = new Accountant(233325456);
        diego.setName("Diego Ramirez");
        diego.setDocument("12233545645");
        diego.setSalary(2500);
        System.out.println(diego.getBonus());//250.0

        //test manager
        Manager juan = new Manager("9kr3t$4*g+64f2s");
        juan.setName("Juan Sandoval");
        juan.setSalary(5000);
        juan.setPassword("Names_555");
        System.out.println(juan.log_In("Names_554"));//false
        System.out.println(juan.log_In("Names_555"));//true

        //log_In's applications
        Validate_log_in(juan.log_In("Names_555"));//Log in successfully

        //tests super attributes
        System.out.println(juan.getBonus());//7500.0
    }

    public static void Validate_log_in(boolean log_in){
        if(log_in){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Wrong password or email ");
        }
    }
}
