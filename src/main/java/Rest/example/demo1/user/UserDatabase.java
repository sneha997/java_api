package Rest.example.demo1.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDatabase {
	private static int countuser =3;
	private static List<User> users=new ArrayList<>();
	{
		users.add(new User("adam",1,new Date()));
		users.add(new User("sneha",2,new Date()));
		users.add(new User("sushant",3,new Date()));
	}
	public List<User> findAll()
	{
		return users;
	}
	public User save(User user){
		if(user.getId()== null)
		{
			user.setId(++countuser);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id)
	{
		for(User user:users) {
			if(user.getId()==id)
			{
				return user;
			}
			
		}
		return null;
	}
	
	public User deleteuser(int id)
	{
			Iterator<User> iterator= users.iterator();
			while(iterator.hasNext())
			{
				User user=iterator.next();
				if(user.getId()==id)
				{
					iterator.remove();
					return user;
				}
				
		
			
		}
		return null;
	}
	
	


}
