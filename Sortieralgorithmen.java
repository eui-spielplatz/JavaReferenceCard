
public class Sortieralgorithmen {
	
	//Sortierung durch Vergleichen zweier nebeneinander liegender Elemente
	//und anschließendes Vertauschen, falls kleineres Element weiter oben im Array
	//Mit jedem Durchlauf durch die Liste ist ein weiteres Element Sortiert
	
	//Itterativer Ansatz: 
	public static int[] bubblesort(int[] array){
		for (int i = 1; i < array.length; i++){
			for (int j = 0; j < (array.length - i); j++){
				if (array[j] > array[j+1]){
					int h = array[j];
					array[j] = array[j+1];
					array[j+1] = h;
				}
			}
		}
		return array;
	}
}
