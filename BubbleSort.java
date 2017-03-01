package algoprogra;


public class BubbleSort {
	public static void sort(int[] data){
		if(data.length < 2){return;}
		boolean hadToSwap= false;
		do{
			hadToSwap=false;
			for(int i= 0; i != data.length-1; ++i){
				if(data[i] > data[i+1]){
					SortArray.swap(data, i, i+1);
					hadToSwap= true;
				} }
		}while(hadToSwap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		BubbleSort.sort(RandomData.generate1d(20,0,500));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}

}
