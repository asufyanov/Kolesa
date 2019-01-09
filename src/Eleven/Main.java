package Eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Comment> comments = new ArrayList();
		comments.add(new Comment(100, 1, 0, "Janibek", "Я первый"));
		comments.add(new Comment(103, 2, 100, "Damir", "Второй"));
		comments.add(new Comment(3, 3, 0, "Roman", "Good Luck"));
		comments.add(new Comment(1, 4, 0, "Aibek", "Bazara NET"));
		comments.add(new Comment(999, 5, 103, "QQQ", "TRETII"));
		comments.add(new Comment(1000, 6, 103, "WWW", "Eshe odin"));
		comments.add(new Comment(1001, 7, 1000, "EEE", "CHETIRE"));
		comments.add(new Comment(1002, 7, 3, "Alihan", "YEAH"));


		
		Comment c = new Comment();
		Map<Long, Comment> map = c.createComemntStructure(comments);
		System.out.println("YES");
		
		

		for (Map.Entry entry : map.entrySet()) {
			Comment comment = (Comment)entry.getValue();
		    System.out.println(comment.getName() + ": " + comment.getContent());
		    recurComments(comment,1);
		}

		
		
	

	}
	
	public static void recurComments(Comment c, int tabLength){
		//if (!c.getChildComments().isEmpty()) System.out.println("");
		for (int i=0; i<c.getChildComments().size(); i++){
			Comment childComment = c.getChildComments().get(i);

			for (int j=0; j<tabLength; j++) System.out.print("--");
			System.out.print(childComment.getName()+": "+childComment.getContent()+"\n");
			recurComments(childComment, tabLength+1);
		}
		
	}

}
