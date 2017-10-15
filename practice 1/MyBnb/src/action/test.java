package action;

public class test {
	public static void main(String[] args) {
		PropertyAction p = new PropertyAction();
		p.FillInProperties(3);
		p.PrintAllProperties();
		System.out.println("the total incomes:"+p.CalculateTotalIncome());

	}
}
