public class Accountant extends Employee{
    private int id_professional_card;
    public Accountant(int Id_professional_card){
        if(Id_professional_card >=100000){
            this.id_professional_card = Id_professional_card;
        }else{
            System.out.println("You don't have experience enough");
        }
    }
}
