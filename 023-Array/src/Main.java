
public class Main {

	public static void main(String[] args) {
		
		int[] array = {5,6,7,8};
		display(array);
//		int[] array2 = new int[10];
//		array2[5] = 10;
//		array2[9] = 99;
//		System.out.println(array2[1]);
		
		float[] floatArr = {0.0f, 1.2f, 3.4f};
		
		/* Syntax for loop of array
		for(data_type variable: array) {
			// body of the loop
		}
		*/
		
		for(float i: floatArr) {
			System.out.println(i);
		}
		
	}
	
	static void display(int a[]) {
		
		for(float i: a) {
			System.out.println(i);

		}
	}

}
