package org.jersey.project.hellojersey.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jersey.project.hellojersey.model.Message;
import org.jersey.project.hellojersey.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	MessageService messageservice =new MessageService();
	@GET
	public List<Message> getMessages()
	{
		return messageservice.getAllMessages();
	}
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId")Long Id,Message message)
	{
		message.setId(Id);
		return messageservice.updateMessage(message);
		
	}
	@DELETE
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam("messageId")Long Id )
	{
		return messageservice.removeMessage(Id);
		
	}
	@POST
	public Message addMessage(@PathParam("messageId")Message messaged)
	{
		return messageservice.addMessage(messaged);
	}
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")Long Id)
	{
		return messageservice.getMessages(Id);
		
	}

}
