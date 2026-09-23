import java.time.LocalDate;
public class Transaction {
	int txId;
	LocalDate txDate;
	float txAmount;
	boolean txStatus;
	boolean txArrears;
	
	public Transaction(int txId, LocalDate txDate, float txAmount,
             boolean txStatus, boolean txArrears) {

		 this.txId = txId;
		 this.txDate = txDate;
		 this.txAmount = txAmount;
		 this.txStatus = txStatus;
		 this.txArrears = txArrears;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
