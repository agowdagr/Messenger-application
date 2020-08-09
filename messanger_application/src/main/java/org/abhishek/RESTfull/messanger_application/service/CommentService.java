package org.abhishek.RESTfull.messanger_application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.abhishek.RESTfull.messanger_application.database.DatabaseClass;
import org.abhishek.RESTfull.messanger_application.model.Comment;
import org.abhishek.RESTfull.messanger_application.model.Message;

public class CommentService {
	private Map <Long, Message> messages= DatabaseClass.getMessages();
	private Map <Long, Comment> comments= DatabaseClass.getComments();
	public CommentService() {
		comments.put(1L, new Comment(1,"Hello Abhi", "Abhi"));
		comments.put(2L, new Comment(2,"congrats", "Abhi"));
	} 

	
	public List<Comment> getAllComment(long messageId) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		return new ArrayList <Comment>(comments.values());
	}
	
	public Comment getComment (long messageId,long commentId) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addComment(long messageId,Comment comment) {
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size()+1);
		comments.put(comment.getId(), comment);
		return comment;
	}
	public Comment updateComment(long messageId, Comment comment) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		if(comment.getId() <= 0) {
			return null;
		}
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment removeComment(long messageId, long commentId) {
		Map<Long,Comment> comments= messages.get(messageId).getComments();
		return comments.remove(commentId);
		
	}
	

}
