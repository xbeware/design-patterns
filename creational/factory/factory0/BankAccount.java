
public abstract class BankAccount extends Account{

	protected double balance;
	protected String id;
	public void Deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}
	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Transfer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", id=" + id + "]";
	}
	
	
}
