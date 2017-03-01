package algoprogra;
import java.util.Random;
import java.util.Arrays;

public class RandomData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(generate1d(100,1,100)));
	}
	

	
		public static int[] generate1d(int nbVals, int min, int max){
			int[] res = new int[nbVals];
			Random generator = new Random();
			for(int i=0;i != nbVals; ++i){
				res[i]=(int)(Math.abs(generator.nextLong()%((long)max-min))+min);
			}
			return res;
		}
	} 