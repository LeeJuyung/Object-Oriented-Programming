package org.object_code.object;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> colors= new ArrayList<>(Arrays.asList("Black","White","Green","Red"));
		String removedColor=colors.remove(0);
		System.out.println("Removed color is "+removedColor);//Black
		
		System.out.println(colors.remove("Yellow")); //false
		System.out.println(colors); //[White, Green, Red]
		colors.remove("Yellow");
		System.out.println("Removed color is "+removedColor); //Black
		
		colors.clear();
		System.out.println(colors); //[]
	}

}
