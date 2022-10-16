package searchingANDsorting;

public class selectionSort {
	
	public static void selectionsort(int[] arr) {
		 for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,12,-5,16,2,12,14};
//					{1,5,-5,12,2,12,14,16}
//					{1,-5,5,2,12,12,14,16}
//					{-5,1,2,5,12,12,14,16}
		
		System.out.println("Array Before Selection Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        
        selectionsort(arr);
        
        System.out.println("Array After Selection Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}

}
