
public class Suche {
	
	//Suche auf einem geordneten Array mit Rückgabe des Index
	public static int binarySearch(int[] array, int element ){
		int leftIndex = 0;
		int rightIndex = array.length -1 ;
		while(leftIndex <= rightIndex){
			int middle = leftIndex + ((rightIndex - leftIndex)/2);
			if (array[middle] == element){
				return middle;
			} else if (array[middle] > element){
				rightIndex = middle - 1;
			} else {
				leftIndex = middle + 1;
			}
		}
		return -1;
	}
}
