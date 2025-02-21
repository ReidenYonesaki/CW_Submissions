import java.util.ArrayList;
public class ArrayList_Intro {

	public static void main(String[] args) {
		//1. Instantiate an empty ArrayList that could have any type in it.
		ArrayList cars = new ArrayList();
		
		System.out.println(cars);

		
		//2. Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> strArrList = new ArrayList<String>();
		
		//3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		intArrList.add(0,1);
		intArrList.add(1,2);
		intArrList.add(2,3);
		
		strArrList.add("Alice");
		strArrList.add("Bob");
		strArrList.add("Charlie");
		
		//4. 4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		intArrList.add(2,5);
		strArrList.add(1,"Derek");
		
		//5. Print out the second and last elements in both intArrList and stringArrList.
		System.out.println(intArrList.get(1));
		System.out.println(intArrList.get(intArrList.size()-1));
		
		System.out.println(strArrList.get(1));
		System.out.println(strArrList.get(strArrList.size()-1));
		
		//6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 
		intArrList.set(0,0);
		strArrList.set(0,"Zero");
		System.out.println(intArrList);
		System.out.println(strArrList);

		//7. Delete the last element in both arrays. Print out what that removed element was. 
		System.out.println(intArrList.remove(intArrList.size()-1));
		System.out.println(strArrList.remove(strArrList.size()-1));
		
		
	}

}
