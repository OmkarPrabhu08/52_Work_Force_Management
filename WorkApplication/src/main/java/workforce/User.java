package workforce;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	public User()
	{
		
	}
	
	public User(int userId, String username, String password)
	{
		this.userId = userId;
		this.userName = username;
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public User(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
