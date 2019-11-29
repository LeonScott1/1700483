
public class Searcher {
	public int linearSearch(int arr[], int arrSize, int searchVal) {
	
	    for(int i=0;i<arrSize;i++){    
            if(arr[i] == searchVal){    
                return i;    
            }    
        }    
        return -1;    
    }    
	
	public int binarySearch(int arr[], int arrSize, int searchval) {

		int first= 0, last = arrSize;
		int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( searchval == arr[mid] )
		        return mid;     
		      if (searchval < arr[mid] )  
		         last = mid - 1;  
		   if ( searchval > arr[mid] ) 
		      first = mid + 1;  
		 }  
		return -1;
}
}
