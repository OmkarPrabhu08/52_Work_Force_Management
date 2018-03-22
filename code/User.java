public class User {
	private String userName;
	private String userPwd;
	PersonalDetails userDetails; 
	String userRole;
	
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

