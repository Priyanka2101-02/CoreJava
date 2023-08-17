package exeptionHandling;
/*
 * User defined  exception: you have to inherit from its main exception
 */
class InsifficientBalanceException extends Exception{
	private double am;
	public InsifficientBalanceException(double amount)
	{
		am=amount;
	}
	public double getAmount()
	{
		return am;
	}
	
}
class ChcekAcc{
	private double bal;
	
	public void deposit(double amount)
	{
		bal+=amount;
	}
	public void withdraw(double amount)throws InsifficientBalanceException
	{
		if(amount<=bal)
		{
			bal-=amount;
		}
		else
		{
			double e =bal;
			throw new InsifficientBalanceException(e);
		}
		
	}
	public double getBalance()
	{
		return bal;
	}
	
}
public class Withdraw {

	public static void main(String[] args) {
		ChcekAcc ca = new ChcekAcc();
		System.out.println("Depositing Rs1000....");
		ca.deposit(1000.00);
		try
		{
			System.out.println("Withdrwaing  Rs600....");
			ca.withdraw(600);
			System.out.println("Withdrwaing  Rs300....");
			ca.withdraw(300);
			System.out.println("Withdrwaing  Rs200....");
			ca.withdraw(200);
			
		}catch(InsifficientBalanceException e)
		{
			System.out.println("Insufficient Balance!!!"+"\n"+e.getAmount());
		}
		

	}

}
