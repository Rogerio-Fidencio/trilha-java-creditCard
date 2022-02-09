public class CreditCard {
	String creditCardNumber;
	String holderName;
	int expirationYear;
	int expirationMonth;
	double balance;
	
	
	public CreditCard(String creditCardNumber, String holderName, int expirationYear, int expirationMonth) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.holderName = holderName;
		this.expirationYear = expirationYear;
		this.expirationMonth = expirationMonth;
		this.balance = 0;
	}


	public String getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}


	public int getExpirationYear() {
		return expirationYear;
	}


	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}


	public int getExpirationMonth() {
		return expirationMonth;
	}


	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	
	
	void addBalance(double balance) {
		this.balance += balance;
	}
	
	boolean buy(double purchaseValue) {
		if (purchaseValue > this.balance) {
			return false;
		}
		
		this.balance -= purchaseValue;
		return true;
	}
	
	
	
}


