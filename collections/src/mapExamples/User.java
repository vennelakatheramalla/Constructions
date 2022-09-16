package mapExamples;

import javax.management.relation.Role;

public class User {
	private int id;
	String userNmae;
	private String password;
	private Role role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userNmae, String password, Role role) {
		super();
		this.id = id;
		this.userNmae = userNmae;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNmae() {
		return userNmae;
	}
	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userNmae=" + userNmae + ", password=" + password + ", role=" + role + "]";
	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	

}
