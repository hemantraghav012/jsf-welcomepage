package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class student {
 private String name,password;



	public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}

	


	public String  save()
	{
		
	    return "success.xhtml";
	}
	
	
}




