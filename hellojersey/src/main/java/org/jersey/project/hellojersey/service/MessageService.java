package org.jersey.project.hellojersey.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.jersey.project.hellojersey.database.DatabaseClass;
import org.jersey.project.hellojersey.model.Message;

import com.sun.xml.bind.marshaller.Messages;


public class MessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	  public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "Ahsan"));
		messages.put(2L, new Message(2, "Hello Jersey", "Farooq"));
	}

	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(); 
	}

	
	public Message getMessages(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	

		/*Message m1=new Message(1,"Hello World","Ahsan");
		Message m2=new Message(2,"Hello Jersey","Ahsan");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list; 
		*/
		
	}


