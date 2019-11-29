
public class Driver {

	public static void main(args[]) {
		int[] arr = null;

		int arrSize = 5;

		int option, searchVal, placeVal;

		Scanner input = new Scanner(System.in);

		

		for(int i = 0; i < arrSize; i++) {

			System.out.println("Enter the a number to the array- Number " + i + ": ");

			arr[i] = input.nextInt();

		}

		

		System.out.println("Select one of the options below:");

		System.out.println("1: Linear Search");

		System.out.println("2: Binary Search (performs a bubble sort before searching)");

		System.out.println("3: Insertion Sort");

		System.out.println("4: Selection Sort");

		System.out.println("5: Bubble Sort");

		System.out.println("Enter the value which you would like to select:");

		option = input.nextInt();

		

		switch(option) {

			case 1: 

				System.out.println("Enter the value that you wish to search for:");

				searchVal = input.nextInt();

				placeVal = linearSearch(arr, arrSize, searchVal);

				System.out.println("The value has been found at the position: " + placeVal);

			break;

			

			case 2: 

				System.out.println("Enter the value that you wish to search for:");

				searchVal = input.nextInt();

				placeVal = binarySearch(arr, arrSize, searchVal);

				System.out.println("The value has been found at the position: " + placeVal);

			break;

			

			case 3: 

				insertionSort(arr, arrSize);

				System.out.println("The array is sorted");

			break;

			

			case 4: 

				selectionSort(arr, arrSize);

				System.out.println("The array is sorted");

			break;
		
		
	}
}
