public class SavingsAccount extends Account{

    public SavingsAccount(int Agency){
        super(Agency);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            this.balance =this.balance +amount;
        }else{
            System.out.println("You don't make a deposit with a negative number");
        }
    }
}
