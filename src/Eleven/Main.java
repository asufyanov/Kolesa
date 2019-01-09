package Eleven;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Comment> comments = new ArrayList();
		comments.add(new Comment(100, 1, 0, "Janibek", "Я первый"));
		comments.add(new Comment(103, 2, 100, "Damir", "Второй"));
		comments.add(new Comment(3, 3, 0, "Roman", "Good Luck"));
		comments.add(new Comment(1, 4, 0, "Aibek", "Bazara NET"));
		
		Comment c = new Comment();
		c.createComemntStructure(comments);
		System.out.println("YES");



	

	}

}
