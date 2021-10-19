
public class CallByValue {

	public static void main(String[] args) {
		
		int value = 10;
		CallByValue cbv = new CallByValue();
		System.out.println("current value in main: " + value);
		cbv.displayValue(value);
		System.out.println("current value in main: " + value);
	}
	
	void displayValue(int value) {
		System.out.println("current value in displayValue: " + value);
		value = 20;
		System.out.println("current value in displayValue: " + value);
	}

}
