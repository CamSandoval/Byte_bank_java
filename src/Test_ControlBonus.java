public class Test_ControlBonus {
    public static void main(String[] args) {
        ControlBonus record_bonus = new ControlBonus();

        Employee david = new Employee();
        david.setSalary(2000);
        System.out.println(david.getBonus());//200.0

        Manager jimena = new Manager();
        jimena.setSalary(2000);
        System.out.println(jimena.getBonus());//2200.0

        record_bonus.total_amount_bonuses(david);
        record_bonus.total_amount_bonuses(jimena);
        System.out.println("The total of bonuses the company is paying is --> "
                + record_bonus.getTotal());//The total of bonuses the company is paying is --> 2400.0
    }
}
