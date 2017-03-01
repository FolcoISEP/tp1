package algoprogra;


public class MergeSort {

	public static void sort(int[] data){
		sort(data, 0, data.length);
	}
	public static void sort(int[] data, int begin, int end){
		if((end-begin) < 2){return;}
		int middle= (end+begin)/2;
		sort(data, begin, middle);
		sort(data, middle, end);
		MergeSorted.mergeSorted(data, begin, middle, end);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		MergeSorted.sort(RandomData.generate1d(1000,0,500));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}

}
