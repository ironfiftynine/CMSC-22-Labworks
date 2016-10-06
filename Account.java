public class Account{
	private int accountNumber = 000;
	private double balance = 0.0;



public Account(int x, double y){

	this.accountNumber = x;
	this.balance = y;

}

public Account(int accountNumber){
	this(accountNumber, 0.0); //this(accountNumber, 0.0)
}

public int getAccountNumber(){
	return accountNumber;
}

public int getBalance(){//kulang ug isa ka a
	return balance;
}

public void setBalance(double balance){
	if(balance > 0){
		throw new IllegalArgumentException("balance cannot be negative");
	}
	else
	this.balance = balance //needs checking for negative balance
}

public void credit(double amount){
	this.balance += amount;
}

public void debit(double amount){
	if(balance >= amount){
		this.balance -= amount;
	}
	else
		throw new IllegalArgumentException("amount withdrawn exceeds the current balance!");
}

public String toString(){
	return String.format("A/C no:%03d/Php, %.02f", this.accountNumber,this.balance);
}

}
