public class Test_Employee {
    public static void main(String[] args) {
        //test employee
        Employee diego = new Employee();
        diego.setName("Diego Ramirez");
        diego.setDocument("12233545645");
        diego.setSalary(2500);
        System.out.println(diego.getBonus());//250.0

        //test manager
        Manager juan = new Manager();
        juan.setName("Juan Sandoval");
        juan.setSalary(5000);
        juan.setPassword("Names_555");
        System.out.println(juan.log_In("Names_554"));//false
        System.out.println(juan.log_In("Names_555"));//true

        //log_In's applications
        Validate_log_in(juan.log_In("Names_555"));//Log in successfully

        //tests super attributes
        System.out.println(juan.getBonus());//3500.0
    }

    public static void Validate_log_in(boolean log_in){
        if(log_in){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Wrong password or email ");
        }
    }
}
