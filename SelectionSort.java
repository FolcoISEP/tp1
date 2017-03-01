package algoprogra;

import java.util.Arrays;

import org.jfree.data.xy.XYSeries;

public class SelectionSort {

	public static int minimumIndex(int[] data, int begin, int end){
		int res= begin;
		for(int i=begin+1; i != end; ++i){
			if(data[i] < data[res]){
				res= i;
			}
		}
		return res;
	}

	public static void sort(int[] data){
		if(data.length < 2){return;}
		for(int i=0; i != data.length-1; ++i){
			SortArray.swap(data, i, minimumIndex(data, i, data.length));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final XYSeries arr_mini = new XYSeries( "array minimum" ); 
		for( int i = 5000 ; i < 50000 ; i = i+5000 ){
			int[] array = RandomData.generate1d(i, 0, 500 );
			long startTime = System.nanoTime();
			SelectionSort.sort(array);
			System.out.println(Arrays.toString(array));
			long endTime = System.nanoTime();	
			long resultTime = endTime-startTime;
			System.out.println("Took "+resultTime + " ns");
			//Integer intResultTime = (int) (long) resultTime;
			//minValueTimeArray.add(intResultTime);
			arr_mini.add(i,resultTime);          

		} 

	}

}

