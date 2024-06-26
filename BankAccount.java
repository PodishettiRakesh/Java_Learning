
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
            System.out.println("amount deposited Successfully");
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount){
        if(amount>0 & amount<=Balence){
            Balence-=amount;
        }else{
            System.out.println("Invalid amount to withdraw");
        }
    }

    public double checkBalence(){
        return this.Balence;
    }

    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Podishetti Rakesh", "2023501062",0 );
        account1.deposit_amount(1200);
        account1.withdraw(200);
        System.out.println(account1.Balence);
        System.out.println(account1.checkBalence());


        
    }


}
