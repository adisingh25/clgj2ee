package adapter;

public class mauritiusTax implements calcTax {
	
	newMauritius obj1;
	
	public mauritiusTax() {
		obj1= new newMauritius();
	}
	
	public double taxAmount(double amount) {
		return obj1.calculateTax(amount);
	}
	
	

}
