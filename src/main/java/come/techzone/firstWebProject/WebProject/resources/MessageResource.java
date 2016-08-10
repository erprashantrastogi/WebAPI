package come.techzone.firstWebProject.WebProject.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import come.techzone.firstWebProject.WebProject.model.Message;
import come.techzone.firstWebProject.WebProject.service.*;

@Path("messages")
public class MessageResource {

	private MessageService messageServiceObj = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Message> getMessages()
	{
		return messageServiceObj.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id)
	{
		return messageServiceObj.getMessage(id);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id, Message messageObj)
	{ 
		messageObj.setId(id);
		return messageServiceObj.updateMessage(messageObj);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam("messageId") long id)
	{ 
		return messageServiceObj.removeMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message newMessaegObj)
	{
		//return "Post success";
		return messageServiceObj.addMessage(newMessaegObj);
	}
}
