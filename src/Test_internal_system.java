public class Test_internal_system {
    public static void main(String[] args) {
        Internal_system system = new Internal_system();
        Administrator juan = new Administrator("jdg%a58d84f#");
        Accountant sofia = new Accountant(1224452);
        Customer david_154 = new Customer("1s4d7i&d#a","David","1002480341");

        //Internal system works because if we send it a parameter that is not Authenticatable, it will throw an error
        //system.authenticate(sofia);

        //Test with authenticatables employees
        system.authenticate(juan,"jdg%a58d84f#");//Login successfully
        system.authenticate(juan,"Hello_World");//Invalid login

        //Test with customers
        system.authenticate(david_154,"1s4d7i&d#a");//Login successfully
        system.authenticate(david_154,"Hello_World");//Invalid login
    }
}
