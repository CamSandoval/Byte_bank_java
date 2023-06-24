public class ControlBonus {
    //This is a class that we'll use to record the total amount of bonuses for all of our employees.
    private double total;

    public double getTotal() {
        return total;
    }

    //For generals employees
    public double total_amount_bonuses(Employee employee){
        this.total = this.total + employee.getBonus();
        return this.total;
    }
    //Thanks to polymorphism, we can only use one method to create a function that
    // will be shared by all instances that are children of employee.

    //For managers
    /*public double total_amount_bonuses(Manager employee){
        this.total = this.total + Manager.getBonus();
        return this.total;
    }*/

    //For Accountants
    /*public double total_amount_bonuses(Accountant employee){
        this.total = this.total + Accountant.getBonus();
        return this.total;
    }*/
}
