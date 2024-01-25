package arraylist;

import java.util.ArrayList;

public class Arraylist2 {
public static void main(String[] args) {
	ArrayList<Integer> n = new ArrayList<>();
	n.add(10);
	n.add(9);
	for(int i =0;i<2;i++) {
		System.out.println(n.get(i));
	}
}
} 
// In array list we cannot use primitive data type in that case we need to use wrapper class for that or we can use only class in
//array list
