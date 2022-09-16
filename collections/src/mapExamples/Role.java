package mapExamples;

public class Role {
	private String role_id;
	private String roleName;
	public Role(String role_id, String roleName) {
		super();
		this.role_id = role_id;
		this.roleName = roleName;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", roleName=" + roleName + "]";
	}
	
	

}
