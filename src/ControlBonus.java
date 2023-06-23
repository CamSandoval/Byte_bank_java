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

    //For managers
    /*public double total_amount_bonuses(Manager employee){
        this.total = this.total + employee.getBonus();
        return this.total;
    }*/
}
