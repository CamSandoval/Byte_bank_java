public class Test_Account {
    public static void main(String[] args) {
        Account savings_account = new SavingsAccount(1);

        Account current_account = new Current_Account(2);

        Account my_current_account = new Current_Account(2);

        Bank_account byte_bank_account = new Bank_account(55);



        //If I want to collect money for a transfer to a different agency,
        // I have to implement a logic into the Account's methods makeATransfer and deposit that will verify the numbers of agencies
        savings_account.deposit(5000);
        savings_account.makeATransfer(2500,current_account,byte_bank_account);
        System.out.println("The balance of the savings account is --> "+ savings_account.getBalance());
        //The balance of the savings account is --> 2499.75
        System.out.println("The balance of the current account is --> "+ current_account.getBalance());
        //The balance of the current account is --> 2500.0
        System.out.println("The balance of the bank account is --> "+ byte_bank_account.getBalance());
        //The balance of the bank account is --> 0.25


        //Testing the method with accounts with the same agency
        current_account.makeATransfer(500,my_current_account,byte_bank_account);
        System.out.println("The balance of the first current account is --> "+ current_account.getBalance());
        //The balance of the first current account is --> 2000.0
        System.out.println("The balance of the second current account is --> "+ my_current_account.getBalance());
        //The balance of the second current account is --> 500.0
        System.out.println("The balance of the bank account is --> "+ byte_bank_account.getBalance());
        //The balance of the bank account is --> 0.25
    }
}
