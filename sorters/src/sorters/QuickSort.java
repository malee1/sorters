package sorters;

public class QuickSort {
	
	public static void quicksort(int[] numbers, int lowIndex, int highIndex) {
		
		if (lowIndex >= highIndex) {
			return;
		}
		
		int pivot = numbers[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while (leftPointer < rightPointer) {
			
			while (leftPointer < rightPointer && numbers[leftPointer] <= pivot) {
				leftPointer ++;
			}
			
			while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer --;
			}
		
			swapNumbers(numbers, leftPointer, rightPointer);
			
		}
		swapNumbers(numbers, leftPointer, highIndex);
		quicksort(numbers, lowIndex, leftPointer-1);
		quicksort(numbers, leftPointer +1, highIndex);
		
	}

	private static void swapNumbers(int[] numbers, int leftPointer, int rightPointer) {
		
		int temp = numbers[leftPointer];
		numbers[leftPointer] = numbers[rightPointer];
		numbers[rightPointer] = temp;
	}

}
