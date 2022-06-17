package sorters;

public class InsertionSort {
	
	public static void insertionSort(int[] numbers) {
		
		System.out.println("Test");
		System.out.println("Test");
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			int temp = numbers[i];
			int index = i - 1;
			
			while (index >= 0 && numbers[index] > temp) {
				numbers[index + 1] = numbers[index];
				index --;
			}
			numbers[index +1] = temp;
		
		}
		
	}

}
	
