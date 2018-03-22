enum Role{
	EMPLOYEE,
	MANAGER
}

public class User {
	private String userName;
	private String userPwd;
	PersonalDetails userDetails; 
	Role userRole;
	
	public String getUserName()
	{
		return this.userName; 
	}
	
	public void setUserName(String username)
	{
		this.userName = username;
	}
	
	public String getUserPwd()
	{
		return this.userPwd; 
	}
	
	public void setUserPwd(String userpwd)
	{
		this.userPwd = userpwd;
	}
	public String getUserRole()
	{
		return this.userRole; 
	}
	
	public void setUserRole(Role userRole)
	{
		this.userRole = userRole;
	}
	
	Boolean changePassword(String newpwd)
	{
		this.userPwd = newpwd;
		return true;
	}
	
	Boolean login(String username, String userpwd)
	{
		if ((this.userName == username) && (this.userPwd == userpwd))
		{
			// do something
			return true;
		}
		else return false;
	}
	
	Boolean logout()
	{
		// do something
		return true;
	}
	
	
}

