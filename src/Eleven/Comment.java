package Eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Comment implements CommentDataFactory{
	/*
	 * Сделал такое решение, где каждый начальный комент - это дерево
	 * Поэтому у каждого комментария есть список подКоментов
	 * 
	 * Сделал решение, где коментарии могут быть данны в разброс
	 * Не только по порядку
	 * 
	 * В Main Класс сделал рекурсивный вывод с отступами,
	 * Запустите для наглядности
	 * 
	 * Если родительский коментарий не является корневым,
	 * то ищу его тоже рекурсивно
	 * 
	 * 
	 */
	
	private long id;
	private long userId;
	private long replyTo;
	private String name;
	private String content;


	private List<Comment> childComments;
	
	public Comment(){
		childComments = new ArrayList();
	}
	
	public Comment(long id, long userId, long replyTo, String name, String content){
		childComments = new ArrayList<>();
		this.id =  id;
		this.userId = userId;
		this.replyTo = replyTo;
		this.name = name;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public long getUserId() {
		return userId;
	}
	public long getReplyTo() {
		return replyTo;
	}
	public String getName() {
		return name;
	}
	public String getContent() {
		return content;
	}

	@Override
	public Map <Long, Comment> createComemntStructure(List comments) {
		// TODO Auto-generated method stub
		
		Map<Long, Comment> map = new HashMap<Long, Comment>();
		Comment tempComment;
		
		ArrayList<Comment> commentArrayList = new ArrayList<>();
		commentArrayList.addAll(comments);
		
		Collections.sort(commentArrayList, new Comparator<Comment>(){
		    public int compare(Comment s1, Comment s2) {
		    	Long l1 = s1.getId();
		    	Long l2 = s2.getId();
		    	
		    	
		        return l1.compareTo(l2);
		    }
		});
		
		
		if (comments == null) return null;
		
		for (int i = 0; i<commentArrayList.size(); i++){
			tempComment = commentArrayList.get(i);
			if (tempComment.getReplyTo() == 0 && !map.containsKey(tempComment.getId()))
				map.put(tempComment.getId(), tempComment);
				
			else if (map.containsKey(tempComment.getReplyTo()))
				map.get(tempComment.getReplyTo()).childComments.add(tempComment);
			
			else {
				Comment parent = null;

				for (Map.Entry entry : map.entrySet()) {
					Comment comment = (Comment)entry.getValue();
					
				    parent = recurFind(comment, tempComment.getReplyTo());
				    if (parent!=null) break;
				}
				if (parent!=null) parent.getChildComments().add(tempComment);
			}
				
		}
		
		return map;
	}
	
	private Comment recurFind(Comment c, Long id){
		Comment comment = null;
		List<Comment> t_comments = c.getChildComments();
		for (int i=0; i<t_comments.size(); i++){
			if (t_comments.get(i).getId()==id) return t_comments.get(i);
			comment = recurFind(t_comments.get(i), id);
			if (comment!=null) return comment;
		}
		
		return null;
	}
	
	public List<Comment> getChildComments() {
		return childComments;
	}

	public void setChildComments(List<Comment> childComments) {
		this.childComments = childComments;
	}

  
	

	
}
