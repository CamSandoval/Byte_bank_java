public class Internal_system {
    //private String password = "1234";
    public boolean authenticate(Authenticatable_employee manager){
        boolean can_log_in = manager.log_In(manager.getPassword());
        if(can_log_in){
            System.out.println("Login successfully");
            return true;
        }else{
            System.out.println("Invalid login");
            return false;
        }
    }
}
