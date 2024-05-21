package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

//Check If List Contains Specific Element
public class CheckIfListContainsSpecificElement {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>(Arrays.asList("Apple","Apple", "Strawberry", "Banana", "Banana", "Pineapple", "Strawberry"));
		ArrayList<String> list = new ArrayList<String>();
		list.add("Orange");
		list.add("Pear");
		list.add("Watermelon");
		list.add("Cantaloop");
		list.add("CusturdApple");
		
		//first approach
		String s = "Orange";
		boolean status = list.contains(s);
		System.out.println(status);
		
		//second approach
		for(String X:list) {
			if(X==s) {
				System.out.println("Orange is present");
			}
		}
		
	}

}
