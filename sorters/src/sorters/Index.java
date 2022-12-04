package sorters;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

public class Index {

	public static void main(String[] args) {
		
		// generate an array with random numbers
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = rand.nextInt(100);
		}
		
		// print array before sort
		System.out.println("Before Sort:");
		printArray(numbers);
		
		// mark time before initiating sort
		LocalTime startTime = LocalTime.now();
		
		// call sorting methods
		QuickSort.quicksort(numbers, 0, numbers.length - 1);
//		InsertionSort.insertionSort(numbers);
//		BubbleSort.bubbleSort(numbers);
//		BubbleSort.bubbleSort2(numbers);
//		MergeSort.mergeSort(numbers);
		
		// mark time and calc duration after sort
		LocalTime endTime = LocalTime.now();
		Duration duration = Duration.between(startTime, endTime);
	
		
		// print array after sort + duration
		System.out.println("After Sort:");
		printArray(numbers);
		System.out.println("Duration: " + duration);
	}
	
	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i ++) {
			System.out.println(numbers[i]);
		}
	}

}
