package org.abhishek.RESTfull.messanger_application.database;

import java.util.HashMap;
import java.util.Map;

import org.abhishek.RESTfull.messanger_application.model.Comment;
import org.abhishek.RESTfull.messanger_application.model.Message;
import org.abhishek.RESTfull.messanger_application.model.Profile;

public class DatabaseClass {
	 
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	private static Map<Long, Comment> comments = new HashMap<>();
	
	public static Map<Long, Comment> getComments(){
		return comments;
	}
	
	public static Map<Long, Message>getMessages(){
		return messages;

	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	
	

}
