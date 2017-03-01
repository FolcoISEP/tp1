package algoprogra;

public class QuickSort {
	public static int partition(int[] data, int begin, int end, int pivotIdx){
		SortArray.swap(data, pivotIdx, --end);
		pivotIdx= end;
		int pivot= data[pivotIdx];
		//invariant is that everything before begin is known to be < pivot
		// and everything after end is known to be >= pivot
		while(begin != end){
			if(data[begin] >= pivot){
				SortArray.swap(data, begin, --end);
			}else{
				++begin;
			}
		}
		SortArray.swap(data, pivotIdx, begin);
		return begin;
	}
	public static void sort(int[] data){
		sort(data, 0, data.length);
	}

	public static void sort(int[] data, int begin, int end){
		if((end-begin) < 2){ return; }
		int m= partition(data, begin, end, (end+begin)/2);
		sort(data, begin, m);
		sort(data, m+1, end); // +1 for convergence 
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
