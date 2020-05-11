package Rest.example.demo1.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	@Size(min=2)
   private String name;
   private Integer id;
   @Past
   private Date birthdate;
   
   protected User() {
	   
   }
   
   
   public User(String name,int id,Date birthdate)
   {
	   super();
	   this.name=name;
	   this.id=id;
	   this.birthdate=birthdate;
   }
   public void setId(Integer id) {
	 this.id=id;
	
   }
   public Integer getId()
   {
	   return id;
   }
   public void setDate(Date birthdate) {
		 this.birthdate=birthdate;
		
	   }
	   public Date getBirthdate()
	   {
		   return birthdate;
	   }
	   public void setName(String name) {
			 this.name=name;
			
		   }
		   public String getName()
		   {
			   return name;
		   }
}
