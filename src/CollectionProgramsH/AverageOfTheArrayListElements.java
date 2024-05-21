package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfTheArrayListElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(34,56,1,2,7,9,23));
		int sum=0;
		double avg =0;
		for(Integer x:al) {
			sum=sum+x;
			avg= (double)sum/al.size();
		}
		System.out.println(avg);
	}
}
