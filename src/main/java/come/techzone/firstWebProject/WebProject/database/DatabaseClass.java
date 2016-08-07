package come.techzone.firstWebProject.WebProject.database;

import java.util.HashMap;
import java.util.Map;

import come.techzone.firstWebProject.WebProject.model.*;

public class DatabaseClass {

	private static Map<Long,Message> messages = new HashMap<>();
	private static Map<Long,Message> profiles = new HashMap<>();
	
	public static Map<Long,Message> getAllMessages(){
		return messages;
	}
	
	public static Map<Long,Message> getAllProfiles(){
		return profiles;
	}
	
}
