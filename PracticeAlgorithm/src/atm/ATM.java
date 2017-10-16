package atm;
/*ATM is used by bank customers. A customer has a
�? Checking account
�? Savings account
�? Customer number
�? PIN

Customers can select an account
�? The balance of the selected account is displayed
�? Then, customer can deposit and withdraw money
�? Process is repeated until the customer chooses to exit*/

/*If the user presses A or B
• The ATM remembers selected account
• The display shows:
Balance = balance of selected account
Enter amount and select transaction
A = Withdraw
B = Deposit
C = Cancel*/
public class ATM {
	//contruct an ATM for a given bank
  public static final int CHECKING=1;
  public static final int SAVING=2;
  public static final int START=2;
  public static final int PIN=2;
  public static final int ACCOUNT=3;
  public static final int TRANSACT=4;
  private int state;
  private int customerID;
  private Customer cus;
  private BankAccount curAcc;
  private Bank bank;
  public ATM(Bank bank){
	   this.bank=bank;
	   reset();
  }
  public void reset(){
	  customerID=-1;
	  curAcc=null;
	  state=START;
  }
  //set the current customer number, and set state to start
  // preconditon: state is start
  public void setCustomerId(int number){
	  assert state==START;
	  customerID=number;
	  state=PIN;
	  
  }
  //find customer in bank, if found sets state to ACCOUNT
  // else to START
  //precondition: state is PIN
  public void selectCustomer(int pin){
	  assert state==PIN;
	  cus=bank.findCus(customerID, pin);
	  if(cus==null){
		  state=START;
	  }else{
		  state=ACCOUNT;
	  }
  }
  public void selectAccount(int account){
	  assert state==ACCOUNT||state==TRANSACT;
	  if(account==CHECKING){
		  curAcc=cus.getCheckingAccount();
	  }else{
		  curAcc=cus.getSavingAccount();
	  }
	  state=TRANSACT;
  }
  public void withDraw(double value){
	  assert state==TRANSACT;
	  curAcc.withdraw(value);
  }
  public void deposit(double value){
	  assert state==TRANSACT;
	  curAcc.deposit(value);
  }
  public double getBanlance(){
	  assert state==TRANSACT;
	  return curAcc.getBalance();
  }
  public void back(){
	  if(state==TRANSACT){
		  state=ACCOUNT;
	  }else if(state==ACCOUNT){
		  state=PIN;
	  }else if(state==PIN){
		  state=START;
	  }
  }
  public int getState(){
	  return state;
  }
}
