package sorters;

public class MergeSort {
public static void mergeSort(int[] numbers) {
		
		int inputLength = numbers.length;
		
		// return if Array size is one element
		if (inputLength < 2) {
			return;
		}
		
		// split the array in 2
		int halfLength = inputLength / 2;
		
		int[] array1 = new int[halfLength];
		int[] array2 = new int[inputLength - halfLength];
		
		populateArrays(numbers, array1, array2);
		
		// recursive call to get to array size of 1
		mergeSort(array1);
		mergeSort(array2);
		
		// merge the arrays
		mergeArrays(numbers, array1, array2);
		
	}
	
	private static void mergeArrays(int[] numbers, int[] array1, int[] array2) {
		int array1Length = array1.length;
		int array2Length = array2.length;
		
		
		int i = 0, j = 0, k= 0;
		
		while (i < array1Length && j < array2Length) {
			if (array1[i] <= array2[j]) {
				numbers[k] = array1[i];
				i++;
			}else{
				numbers[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while (i < array1Length) {
			numbers[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2Length) {
			numbers[k] = array2[j];
			j++;
			k++;
		}
	}

	private static void populateArrays(int[] numbers, int[] array1, int[] array2) {
		
		int index = 0;
		
		//  populate array 1
		for (int i = 0; i < array1.length; i++) {
			array1[i] = numbers[i];
			index++;
		}
		
		// populate array 2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = numbers[index];
			index++;
		}
		
	}

}
