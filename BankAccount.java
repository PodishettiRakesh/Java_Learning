public class BankAccount {
    String HolderName;
    String AcNumber;
    double Balence;

    public BankAccount(String HolderName,String AcNumber,double Balence){
        this.HolderName=HolderName;
        this.AcNumber=AcNumber;
        this.Balence=Balence;
    }

    // Deposit amount into bank
    public void deposit_amount(int amount){
        if(amount>0){
            Balence+=amount;
        }else{
            System.out.println("Invalid Amount");
        }
    }

    
}
