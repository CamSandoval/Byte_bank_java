public class Test_ControlBonus {
    public static void main(String[] args) {
        ControlBonus record_bonus = new ControlBonus();

        //We will change the data type Employee for any of its children classes, this is because we convert employee into an abstract class
        // Employee david = new Employee();
        Accountant david = new Accountant(1000002546);
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
                + record_bonus.getTotal());//The total of bonuses the company is paying is --> 6050.0
    }
}
