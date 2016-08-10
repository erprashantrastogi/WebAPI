package come.techzone.firstWebProject.WebProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import come.techzone.firstWebProject.WebProject.database.DatabaseClass;
import come.techzone.firstWebProject.WebProject.model.*;

@Path("/profiles")
public class ProfileService {
	
	private Map<String,Profile> profiles  = DatabaseClass.getAllProfiles();
	
	public ProfileService()
	{
		Profile profile1 = new Profile(1,"rj","Ashu","Bhardwaj");
		Profile profile2 = new Profile(1,"dj","Devinder","Jaryal");
		
		profiles.put(profile1.getProfileName(), profile1);
		profiles.put(profile2.getProfileName(), profile2);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfile()
	{
		return new ArrayList<Profile>(profiles.values());
	}
}
