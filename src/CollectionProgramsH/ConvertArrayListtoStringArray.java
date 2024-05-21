package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListtoStringArray {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("New york");
		al.add("Chicago");
		al.add("Boston");
		al.add("Austin");
		al.add("Tempa");
		
		//first approach
		String[] arr = new String[al.size()];
		//conversion using al.get() method
		for(int i=0;i<al.size();i++) {
			arr[i] = al.get(i);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("**************************");
		
		//second approach - more preferable
		ArrayList<String> list = new ArrayList<String>();
		list.add("New york");
		list.add("Chicago");
		list.add("Boston");
		list.add("Austin");
		list.add("Tempa");
		
		String[] a = new String[list.size()];
		//conversion using list.toArray() method
		list.toArray(a);
		System.out.println(Arrays.toString(a));
		
	}

}
