package net.javaguides.todoapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	
	
	@Column(name = "password")
	private String password;
	@Column(name = "user_name")
	private String user_name;
	//@Column(name = "status")
	//private boolean status;
	
	protected User() {
		
	}
	
	public User(String fname, String lname, String password, String user_name) {
		super();
		//this.id = id;
		this.first_name= fname;
		this.last_name = lname;
		this.password = password;
		this.user_name = user_name;
		//this.status = isDone;
	}

/*	public Todo(String title, String username, String description, LocalDate targetDate, boolean isDone) {
		super();
		this.title = title;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.status = isDone;
	}*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfname() {
		return first_name;
	}
	
	public void setfname(String fname) {
		this.first_name = fname;
	}
	
	public String getUsername() {
		return user_name;
	}

	public void setUsername(String username) {
		this.user_name = username;
	}

	public String getlname() {
		return last_name;
	}

	public void setlname(String lname) {
		this.last_name = lname;
	}
	public String getpass() {
		return password;
	}

	public void setpass(String username) {
		this.password = username;
	}


	/*public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}*/

/*	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

