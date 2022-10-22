package homework;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		list with 10 elements
		someListMethod();
		
//		Update Group
		Group g = new Group(12);

		for (int i = 0; i < 10; i++) {
			String name = "st" + i;
			int age = 17 + i;
			g.add(new Student(name, age, "m"));
		}
		System.out.println(g.toString());
		
//		Cola Deque
		ColaDegue cd = new ColaDegue();
		cd.howMuchCouple(2);
		
		File f1 = new File("a.txt");
		CharsInText cit = new CharsInText(f1);
		cit.howManyChars();
	}
	
	public static void someListMethod() {
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 1; i < 11; i++) {
			arr.add("elem"+i);
		}
		arr.remove(0);
		arr.remove(0);
		arr.remove(arr.size()-1);
		System.out.println(arr);
	}
}
