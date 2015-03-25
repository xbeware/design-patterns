
public class Banker{

	private static Banker self;
	private static int nextId = 0;
	private static final String banc = "BCR";
	private Banker(){
		
	}
	
	public static Banker GetBanker(){
		if (Banker.self == null)
			Banker.self = new Banker();
		return Banker.self;
		
}
	
	public BankAccount OpenAccount(AccountType type){
		Banker.nextId++;
		String AccountName = Banker.banc+this.nextId;
		BankAccount account = null;
		switch(type){
		case SAVINGS: account = new SavingsAccount(AccountName);
		break;
		case CURRENT: account = new CurrentAccount(AccountName);
		break;
		}
		return account;
	}
	
}
	
enum AccountType{
	SAVINGS, CURRENT
}