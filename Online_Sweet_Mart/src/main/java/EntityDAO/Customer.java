package EntityDAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	
	@ManyToOne
	@JoinColumn(name ="Admin_id")
	Admin add;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String username, String password, Admin add) {
		super();
		this.username = username;
		this.password = password;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdd() {
		return add;
	}

	public void setAdd(Admin add) {
		this.add = add;
	}
	
	
}