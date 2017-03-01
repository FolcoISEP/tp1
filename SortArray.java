package algoprogra;


public class SortArray {

	public static void swap(int[] data, int i, int j){
		int tmp= data[i];
		data[i]= data[j];
		data[j]= tmp;
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		SelectionSort.sort(RandomData.generate1d(10000,5,10000));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 

	}

}
