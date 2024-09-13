
class Account {
	String accnumber;
	Double balance;
	String accname;
	
	Account(String accnumber,Double balance,String accname)
	{
		this.accnumber=accnumber;
		this.balance=balance;
		this.accname=accname;
	}
	void deposit(Double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("deposited:"+amount);
		}
		else
		{
			System.out.println("the amount must be positive:");
		 
		}
	}
	void displayAccount()
	{
		System.out.println("accnumber::"+accnumber);
		System.out.println("balance::"+balance);
		System.out.println("accname::"+accname);
		
	}
}
class Savingaccount extends Account
{
	Double interstRate;
	Savingaccount(String accnumber,Double balance,String name,Double interstRate)
	{
		super(accnumber, balance, name);
		this.interstRate=interstRate;
	}
	void addInterstRate()
	{
		Double interst=balance*(interstRate/100);
		balance+=interst;
		System.out.println("interst added::"+interst);
		
	}
}

class CheckingAccount extends Account
{
	double overdraftLimit;

	   
    CheckingAccount(String accnumber, double balance, String accname, double overdraftLimit) {
        super(accnumber, balance, accname);
        this.overdraftLimit = overdraftLimit;
    }

 
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Withdrawal denied. Exceeds overdraft limit.");
        }
    }

}
public class Bank{
	public static void main(String[]args) {
		System.out.println("---my CheckingAccount----");
		CheckingAccount c=new CheckingAccount("1644",10000.0,"surendra nath",500);
		c.displayAccount();
		c.withdraw(3000);
		c.deposit(50000.0);
		System.out.println(c.balance);
		
	
		
		System.out.println("----my savings account__");
		Savingaccount s=new Savingaccount("1644",50000.0,"surendra nath",10.5);
		s.addInterstRate();
		s.displayAccount();
		System.out.println(s.balance);
	
	
	}
}
