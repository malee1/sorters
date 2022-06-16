package sorters;

public class BubbleSort {
	
	public static void bubbleSort(int[] numbers) {
		
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j ++) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
	}
	
	public static void bubbleSort2(int[] numbers) {
		boolean swapped = true;
		
		
		while (swapped) {
			swapped = false;
			for (int i = 0; i < numbers.length -1; i++) {
				if (numbers[i] > numbers[i+1]) {
					swapped = true;
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
	}

}
