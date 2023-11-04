package org.object_code.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> colors= new ArrayList<>(Arrays.asList("Black","White","Green","Red"));
		
		for(String color : colors) {
			System.out.println(color+" ");
		}
		System.out.println();
		//반복문
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i)+" ");
		}
		System.out.println();
		//커서 같은 개념. hasnext:다음게 있냐- 있으면 true 없으면false
		//next는 다음 값을 가져옴
		Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
	}
	

}
