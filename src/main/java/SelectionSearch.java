import java.util.ArrayList;

public class SelectionSearch {

	// Find the highest integer in an array
	// @param a - an integer array
	// @return the greatest integer in the array
	public static int findHighest(int[] a)
	{
		
	}
	
	
	// Find the lowest integer in an array
	// @param a - an integer array
	// @return the smallest/most negative integer in the array
	public static int findLowest(int[] a)
	{
		
	}
	
	// Find the highest integer in an ArrayList
	// @param a - an ArrayList containing Integers
	// @return the greatest integer in the ArrayList
	public static int findHighest(ArrayList<Integer> a)
	{
		
	}
	
	
	// Find the lowest integer in an ArrayList		
	// @param a - an ArrayList containing Integers
	// @return the smallest/most negative integer in the array
	public static int findLowest(ArrayList<Integer> a)
	{
		
	}
	
	public static void main(String[] args)
	{
		int[] a = {5, 2, 100, 3, 8, 125, 2048, 0, 1, 7, 2, 100, 1000, 500, 27 };
		
		
		System.out.println("The next tests use int[] a = " + SelectionSearch.arrayPrint(a));
		System.out.println("findHighest(a) returns " + SelectionSearch.findHighest(a) + " and should return 2048.");
		System.out.println("findLowest(a) returns " + SelectionSearch.findLowest(a) + " and should return 0.");
		System.out.println();
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(6); b.add(3); b.add(101); b.add(4); b.add(9); b.add(126); b.add(2049); b.add(1); b.add(2); b.add(8); b.add(3); b.add(101); 
		b.add(1001); b.add(501); b.add(28); 
		System.out.println("The next tests use ArrayList<Integer> b = " + SelectionSearch.arrayListPrint(b));
		System.out.println("findHighest(b) returns " + SelectionSearch.findHighest(b) + " and should return 2049.");
		System.out.println("findLowest(b) returns " + SelectionSearch.findLowest(b) + " and should return 1.");
		
		System.out.println();
		System.out.println("Congratulations -- you made it through all the tests!");
	}
	
	// Print an array in one line all pretty like
	public static String arrayPrint(int[] a)
	{
		String ret = "[";
		for (int i : a)
			ret += i + ", ";
		ret = ret.substring(0, ret.length()-2);
		ret += "]";
		return ret;
	}
	
	// Print an ArrayList in one line all pretty like
	public static String arrayListPrint(ArrayList<Integer> a)
	{
		String ret = "[";
		for (int i : a)
			ret += i + ", ";
		ret = ret.substring(0, ret.length()-2);
		ret += "]";
		return ret;
	}

}
