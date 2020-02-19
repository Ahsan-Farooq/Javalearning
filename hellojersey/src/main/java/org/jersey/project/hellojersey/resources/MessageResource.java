package org.jersey.project.hellojersey.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jersey.project.hellojersey.model.Message;
import org.jersey.project.hellojersey.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageservice =new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return messageservice.getAllMessages();
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")Long Id)
	{
		return messageservice.getMessages(Id);
		
	}

}
