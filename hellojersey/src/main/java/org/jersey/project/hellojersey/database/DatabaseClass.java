package org.jersey.project.hellojersey.database;

import java.util.HashMap;
import java.util.Map;

import org.jersey.project.hellojersey.model.Message;
import org.jersey.project.hellojersey.model.Profile;

import com.sun.xml.bind.marshaller.Messages;

public class DatabaseClass {
	private static Map<Long, Message> messages= new HashMap<>();
	private static Map<Long, Profile> profiles= new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
		public static Map<Long, Profile> getProfiles(){
			return profiles;
	}

}
