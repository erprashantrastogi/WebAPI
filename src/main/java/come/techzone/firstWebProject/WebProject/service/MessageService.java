package come.techzone.firstWebProject.WebProject.service;

import come.techzone.firstWebProject.WebProject.database.DatabaseClass;
import come.techzone.firstWebProject.WebProject.model.*;
import java.util.ArrayList;
import java.util.Map;

public class MessageService {

	private Map <Long,Message> messages  = DatabaseClass.getAllMessages();
	
	public MessageService()
	{
		Message m1 = new Message(1,"First Message","Prashant");
		Message m2 = new Message(2,"Second Message","Ashish");
		
		messages.put(m1.getId(), m1);
		messages.put(m2.getId(), m2);
	}
	
	public ArrayList<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long messageId)
	{ 
		return messages.get(messageId);
	}
	
	public Message addMessage(Message newMessaegObj){
		
		newMessaegObj.setId(messages.size()+1);
		messages.put(newMessaegObj.getId(), newMessaegObj);
		return newMessaegObj;
	}
	
	public Message updateMessage(Message updatedMessaegObj){
		
		if( updatedMessaegObj.getId() <= 0)
		{
			return null;
		}
		messages.put(updatedMessaegObj.getId(), updatedMessaegObj);
		return updatedMessaegObj;
	}
	
	public Message removeMessage(long messageId){
		return messages.remove(messageId);
	}
}

