import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[][] myArray = new int[3][3];
		
		myArray[0][0] = 1;
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		myArray[1][0] = 4;
		myArray[1][1] = 5;
		myArray[1][2] = 6;
		myArray[2][0] = 7;
		myArray[2][1] = 8;
		myArray[2][2] = 9;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 Compare arrays
		 */
		int myArray2[] = {10,15,20,30};
		int myArray3[] = {10,15,20,30};
		
		System.out.println("Compareing two integer arrays: " + Arrays.compare(myArray2, myArray3));
	
		
		/*
		 Fill an array
		 */
		
		int myArray4[] = new int[5];
		
		int fillValue = 15;
		
		Arrays.fill(myArray4, fillValue);
		
		System.out.println("Integer Array on filling: " + Arrays.toString(myArray4));
	}

}
