package arrey;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSpliterator
{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("abc@gmail.com");
		list.add("xyz@gmail.com");
		list.add("user@gmail.com");
		list.add("mno@gmail.com");
		list.add("random@gmail.com");
		list.add("gr@gmail.com");
		
		 
 
		System.out.print("List of Emails: ");
		System.out.println(list);
		 
}
}