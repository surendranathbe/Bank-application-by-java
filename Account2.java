
 class Bank2 {
	String Accnumber;
	Double balance;
	String Accname;
	
	Bank2(String Accnumber,Double balance,String Accname)
	{
		this.Accnumber=Accnumber;
		this.balance=balance;
		this.Accname=Accname;
		
	}
	
	void deposit(Double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("amount deposited::"+amount);
		}
		else
		{
			System.out.println("plz deposit the amount i positive");
		}
	}
	void displayBank2()
	{
		System.out.println("Accnumber:"+Accnumber);
		System.out.println("balance:"+balance);
		System.out.println("Accname"+Accname);
	}
}

class SavingAccount2 extends Bank2 {
	Double interstRate;
	SavingAccount2(String Accnumber,Double balance,String Accname,Double interstRate)
	{
	  super(Accnumber,balance,Accname);
	  this.interstRate=interstRate;
	}
	
	void addInterstRate(Double InterstRate)
	{
		Double interst=balance*(interstRate/100);
		balance+=interst;
		System.out.println("interst added:"+interst);
	}
}

class CheckingAccount2 extends Bank2  {
	Double overdraftlimit;
	CheckingAccount2(String Accnumber,Double balance,String Accname,Double overdraftlimit)
	{
		super(Accnumber,balance,Accname);
		this.overdraftlimit=overdraftlimit;
	}
	 
	void withdrawl(Double amount)
	{
		if (amount > 0 && balance - amount >= -overdraftlimit) {
			balance-=amount;
			System.out.println("withdraw:"+amount);
			System.out.println("the amount is sucessfully withdrawled");
		}
		else
		{
			System.out.println("your amount is exceed from overdraftlimit");
		}
	}
	
}

 public class Account2 {
	public static void main(String[]args)
	{
		System.out.println("----my checkinhg account___");
		CheckingAccount2 ca=new CheckingAccount2("1644",50000.0,"surendra nath",1000.0);
		ca.displayBank2();
		ca.deposit(4500.0);
		System.out.println(ca.balance);
		ca.deposit(55000.0);
		ca.withdrawl(50000.0);
		System.out.println(ca.balance);
		
	
		
		System.out.println("----my saving account___");
		SavingAccount2 sa2=new SavingAccount2("1644",50000.0,"surendra nath",2.5);
		sa2.displayBank2();
		sa2.addInterstRate(2.5);
		System.out.println(sa2.balance);
		
		
	}
}
	


	