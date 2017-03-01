package algoprogra;

public class MergeSorted {

	public static void mergeSorted(int data[], int begin, int middle, int end){
		int[] tmp= new int[middle-begin];
		System.arraycopy(data, begin, tmp, 0, tmp.length);
		int i=0, j=middle, dest=begin;
		while((i< tmp.length) && (j<end)){
			data[dest++]= (tmp[i] < data[j]) ? tmp[i++] : data[j++] ;
		}
		while(i < tmp.length){
			data[dest++]= tmp[i++];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		MergeSorted.sort(RandomData.generate1d(1000,0,500));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	static void sort(int[] generate1d) {
		// TODO Auto-generated method stub
		
	}

}
