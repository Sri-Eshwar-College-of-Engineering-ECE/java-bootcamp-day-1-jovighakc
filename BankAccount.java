
public class BankAccount {
	int balance = 10000;
	public void deposit() {
		int depositAmount = 2000;
		int updatedBalance = balance+depositAmount;
		System.out.println("Current Balance : "+balance);
		System.out.println("Deposited Amount : "+depositAmount);
		System.out.println("updated Balance : "+updatedBalance);
	}
	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		bankaccount.deposit();

	}

}
