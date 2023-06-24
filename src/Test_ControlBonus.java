public class Test_ControlBonus {
    public static void main(String[] args) {
        ControlBonus record_bonus = new ControlBonus();

        Employee david = new Employee();
        david.setSalary(2000);
        System.out.println(david.getBonus());//200.0

        Manager jimena = new Manager();
        jimena.setSalary(5000);
        System.out.println(jimena.getBonus());//5500.0

        Accountant luis = new Accountant(2);
        luis.setSalary(3500);

        record_bonus.total_amount_bonuses(david);
        record_bonus.total_amount_bonuses(jimena);
        record_bonus.total_amount_bonuses(luis);

        System.out.println("The total of bonuses the company is paying is --> "
                + record_bonus.getTotal());//The total of bonuses the company is paying is --> 7450.0
    }
}
