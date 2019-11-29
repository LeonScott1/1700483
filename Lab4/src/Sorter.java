
public class Sorter {
	static void bubbleSort(int[] arr, int arrSize) {  
          
        int temp = 0;  
         for(int i=0; i < arrSize; i++){  
                 for(int j=1; j < (arrSize-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
         
	}
	
	public static void selectionSort(int[] arr, int arrSize){  
        for (int i = 0; i < arrSize - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arrSize; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       

	 public static void insertionSort(int array[], int arrSize) {    
	        for (int j = 1; j < arrSize; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	 }
}
