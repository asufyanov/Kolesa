package Eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Comment implements CommentDataFactory{
	
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
				
		}
		
		return map;
	}

  
	

	
}
