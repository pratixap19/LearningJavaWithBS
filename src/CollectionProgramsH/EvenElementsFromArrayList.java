package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenElementsFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(34,56,1,2,7,9,23, 2));
		ArrayList<Integer> evenElements = new ArrayList<Integer>();
		ArrayList<Integer> oddElements = new ArrayList<Integer>();
		for(Integer x:al) {
			if(x%2==0) {
				evenElements.add(x);
			}
			else {
				oddElements.add(x);
			}
		}
		System.out.println("even elements are: "+ evenElements);
		System.out.println("Odd elements are :" +  oddElements);

	}

}
