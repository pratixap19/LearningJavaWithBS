package Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowToGetSynchronizedVersionOfArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();//non synchronized
		List li = Collections.synchronizedList(al);//synchronized

	}

}
