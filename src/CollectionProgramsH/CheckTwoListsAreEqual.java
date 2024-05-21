package CollectionProgramsH;
//Check Two Lists Are Equal
//How do you check UI and DB elements in your project?
import java.util.ArrayList;
import java.util.Arrays;
public class CheckTwoListsAreEqual {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("rectangle", "square", "traingle", "round"));
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("rectangle", "hexagon", "traingle", "round", "pentagon"));
		boolean status = list.equals(list1);
		System.out.println("Are two list are same?" + status);
	}
}
