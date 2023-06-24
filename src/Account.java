import java.util.AbstractCollection;

class Account {
     //When we declared any class without their method main , this is used as a prototype to create many objects
        //Attributes

    //private is a keyword used to limit the scope of one variable or method and prevent its direct modification
     private double balance;
    private int agency;
    private int number;
    //the references are a way to relate one object to another, this is done by creating an attribute with a data
    // type that relates to our object
    private Customer titular = new Customer();
    //Static is a keyword used to create methods an attributes which will be specific to the class but not to its instances
    private static int total=0;


    //the following is a constructor method, which is used to establish that the creation of our object must be
    // initialized with mandatory values by default, and we can do validations within this
    public Account(int Agency){
        if(Agency <=0){
            System.out.println("Numbers less than 0 are not allowed ");
            this.agency =1;
        }else {
                this.agency = Agency;
        }
        total++;
        System.out.println("There are "+ total + " Accounts");
    }

    //there are meany ways to create a method, which is an abstraction of a function or behavior about our
    // class or instance
    /**
     * This method makes a deposit into the owner's account
     * @param amount quantity of money*/
    public void deposit(double amount){
        if(amount > 0){
            this.balance =this.balance +amount;
        }else{
            System.out.println("You don't make a deposit with a negative number");
        }
    }

    /**
     * this method makes a withdrawal into the owner's account
     * @param amount to withdraw*/

    public boolean withdrawal(double amount){
        if(!(amount >0)){
            System.out.println("You don't make a withdrawal with a negative number");
            return false;
        }else{
            if(this.balance >=amount) {
                this.balance -= amount;
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * Makes a transfer from one account to another account
     * @param amount quantity to transfer
     * @param  addressee destination account
     * @return returns if the transfer was successful*/
    public boolean makeATransfer(double amount, Account addressee,Bank_account bank){
        if(this.balance >=amount) {
            if(addressee.agency != this.agency) {
                float tax = 0.25F;
                bank.deposit(tax);
                this.balance -= (amount + tax);
                addressee.deposit(amount);
            }else{
                this.balance -=amount;
                addressee.deposit(amount);
            }
            return true;
        }else{
            return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setNumber(int Number){
        if(Number>0) this.number = Number;
        System.out.println("Negative numbers is not allowed");
    }

    public int getNumber() {
        return number;
    }

    public Customer getTitular() {
        return titular;
    }
    public void setTitular(Customer titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
