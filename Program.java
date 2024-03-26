
public class Program {
  public static void main(String[] args) {
      int min = 0;
      int max = 0;
      int[] emptyArray = {};
      int[] myArray = {34, 21, 67, 89, 45, 65, 43, 50, 60, 105, 168, 298, 394, 486, 698, 806, 999, 1659};
      int[] sortedArray = {2, 5, 6, 10, 32, 45, 48, 49, 50, 100, 105, 2000};
      // System.out.println(SequentialSearch(myArray, 65));
      // int binarySearchResult = BinarySearch(sortedArray, 2000);
      // System.out.println("Binary Search result " + binarySearchResult);
      QuickSort(myArray);
      // System.out.println("Min" + min + "Max" + max);
      
      for (int value : myArray){
        System.out.print(" " + value);
 }
}

  public static int SequentialSearch(int[] arrayToSearch, int valueToLookFor) {
    
    int counter = 0;
    for(int index = 0; index < arrayToSearch.length; index++){  // 1 n + 1 n
      // System.out.println("index" + index);
      counter += 1;
      if(arrayToSearch[index] == valueToLookFor){ // 1
        System.out.println("Counter for sequential search is " + counter);
        return index;
      }
    }
    System.out.println("Counter for sequential search is " + counter);
    return -1;
  }

  public static int BinarySearch (int[] arrayToSearch, int valueToLookFor) {

    int low = 0;
    int high = arrayToSearch.length - 1;
    int counter = 0;
    
    
    while(low <= high){
      counter += 1;
      int mid = (low + high) / 2;

      if(arrayToSearch[mid] == valueToLookFor){
        return mid; // if the value is found return it
      } 
      else if (valueToLookFor < arrayToSearch[mid]) {
          high = mid - 1;
      } else {
        low = mid + 1;
      }

    }
    System.out.println("Counter for binary search is " + counter);
    return -1; // in the case where the key is not found
}
    
  public static int[] FindMinMax(int[] arrayToSearch) {
      int max = arrayToSearch[0];
      int min = arrayToSearch[0];


      for(int i = 1; i < arrayToSearch.length; i++) {
        if(arrayToSearch[i] > max)
            max = arrayToSearch[i];
        else if  (arrayToSearch[i] < min){
          min = arrayToSearch[i];
        }
      }
      return new int[] {min, max};
    
  }
  

public static void QuickSort(int[] arr) {
  
  RecursiveQuickSort(arr, 0, arr.length -1);
}
/**
* Will recursively call itself to perform Quick Sort operartion
* @param arr the array which should be sorted
* @param low starting index for the current sub array being evaluated
* @param high ending index for the current sub array being evaluated
*/
//RecursiveQuickSort will run as long as low is less than high
public static void RecursiveQuickSort(int[] arr, int low, int high) {
  // condition that hgih and low
  if (low < high) {

    int pivotIndex = Partition(arr, low, high);
    RecursiveQuickSort(arr, low, pivotIndex - 1);
    RecursiveQuickSort(arr, pivotIndex + 1, high);
  }
}
  public static int Partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    // set position for smaller element
    int i = (low - 1);

    //j will iterate through each of the elements in the current sub array being evalutated
    // it should start at low and end at high (inclusive)
    for (int j = low; j <= high; j++) {

      if (arr[j] < pivot) {
        i++;
        // swap
        Swap(arr, i, j);
      }
     }
     Swap(arr, i + 1, high);
     // System.out.println(arr);
    return i + 1;

    }


    public static void Swap(int[] arr, int index1, int index2){
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;

    }
}



