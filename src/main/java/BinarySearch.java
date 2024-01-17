import java.util.ArrayList;

public class BinarySearch {
	
	// Finds the number val in the array a (if it is there)
	// @param a the sorted integer array
	// @param val the number to search for
	// @return true if val is in a, false otherwise
	public static boolean find(int[] a, int val)
	{
				
	}
	
	public static boolean find(ArrayList<Integer> a, int val)
	{
				
	}
	
	
	
	public static void main(String[] args)
	{
		int[] a = {2, 3, 5, 7, 10, 14, 22, 25, 27, 36, 44, 49, 52, 57, 64 };
		
		
		System.out.println("The next tests use int[] a = " + SelectionSearch.arrayPrint(a) + " with an odd number of items.");
		System.out.println("find(2) returns " + BinarySearch.find(a, 2) + " and should return true");
		System.out.println("find(10) returns " + BinarySearch.find(a, 10) + " and should return true");
		System.out.println("find(25) returns " + BinarySearch.find(a, 25) + " and should return true");
		System.out.println("find(57) returns " + BinarySearch.find(a, 57) + " and should return true");
		System.out.println("find(64) returns " + BinarySearch.find(a, 64) + " and should return true");
		System.out.println("find(0) returns " + BinarySearch.find(a, 0) + " and should return false");
		System.out.println("find(26) returns " + BinarySearch.find(a, 26) + " and should return false");
		System.out.println("find(45) returns " + BinarySearch.find(a, 45) + " and should return false");
		System.out.println("find(100) returns " + BinarySearch.find(a, 100) + " and should return false");
		System.out.println();
		
		int[] b = {1, 3, 5, 7, 9, 13, 15, 17, 19, 21 };
		
		System.out.println("The next tests use int[] b = " + SelectionSearch.arrayPrint(b) + " with an even number of items.");
		System.out.println("find(1) returns " + BinarySearch.find(b, 1) + " and should return true");
		System.out.println("find(5) returns " + BinarySearch.find(b, 5) + " and should return true");
		System.out.println("find(9) returns " + BinarySearch.find(b, 9) + " and should return true");
		System.out.println("find(13) returns " + BinarySearch.find(b, 13) + " and should return true");
		System.out.println("find(21) returns " + BinarySearch.find(b, 21) + " and should return true");
		System.out.println("find(0) returns " + BinarySearch.find(b, 0) + " and should return false");
		System.out.println("find(6) returns " + BinarySearch.find(b, 6) + " and should return false");
		System.out.println("find(10) returns " + BinarySearch.find(b, 10) + " and should return false");
		System.out.println("find(14) returns " + BinarySearch.find(b, 14) + " and should return false");
		System.out.println("find(64) returns " + BinarySearch.find(b, 64) + " and should return false");
		System.out.println();
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(2); c.add(3); c.add(5); c.add(7); c.add(10); c.add(14); c.add(22); c.add(25); c.add(27); c.add(36); c.add(44); c.add(49);
		c.add(52); c.add(57); c.add(64);
		
		System.out.println("The next tests use ArrayList<Integer> c = " + SelectionSearch.arrayListPrint(c) + " with an odd number of items.");
		System.out.println("find(2) returns " + BinarySearch.find(c, 2) + " and should return true");
		System.out.println("find(10) returns " + BinarySearch.find(c, 10) + " and should return true");
		System.out.println("find(25) returns " + BinarySearch.find(c, 25) + " and should return true");
		System.out.println("find(57) returns " + BinarySearch.find(c, 57) + " and should return true");
		System.out.println("find(64) returns " + BinarySearch.find(c, 64) + " and should return true");
		System.out.println("find(0) returns " + BinarySearch.find(c, 0) + " and should return false");
		System.out.println("find(26) returns " + BinarySearch.find(c, 26) + " and should return false");
		System.out.println("find(45) returns " + BinarySearch.find(c, 45) + " and should return false");
		System.out.println("find(100) returns " + BinarySearch.find(c, 100) + " and should return false");
		System.out.println();
		
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(1); d.add(3); d.add(5); d.add(7); d.add(9); d.add(13); d.add(15); d.add(17); d.add(19); d.add(21);
		System.out.println("The next tests use int[] d = " + SelectionSearch.arrayListPrint(d) + " with an even number of items.");
		System.out.println("find(1) returns " + BinarySearch.find(d, 1) + " and should return true");
		System.out.println("find(5) returns " + BinarySearch.find(d, 5) + " and should return true");
		System.out.println("find(9) returns " + BinarySearch.find(d, 9) + " and should return true");
		System.out.println("find(13) returns " + BinarySearch.find(d, 13) + " and should return true");
		System.out.println("find(21) returns " + BinarySearch.find(d, 21) + " and should return true");
		System.out.println("find(0) returns " + BinarySearch.find(d, 0) + " and should return false");
		System.out.println("find(6) returns " + BinarySearch.find(d, 6) + " and should return false");
		System.out.println("find(10) returns " + BinarySearch.find(d, 10) + " and should return false");
		System.out.println("find(14) returns " + BinarySearch.find(d, 14) + " and should return false");
		System.out.println("find(64) returns " + BinarySearch.find(d, 64) + " and should return false");
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
