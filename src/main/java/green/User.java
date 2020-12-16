package green;

import java.sql.Date;

public class User {
	private int user_id;
	private String user_name;
	private String password;
	private String email;
	private Date data;

	public User() {
	}

	public User(int user_id, String user_name, String password, String email, Date data) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.email = email;
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + user_name + ", id=" + user_id + "]";
	}
}
