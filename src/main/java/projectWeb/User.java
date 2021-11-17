package projectWeb;

public class User { 
	private String username;
	private int nombreArticle;
	private String email;
	private String role;
	public User(String username, int nombreArticle, String email, String role) {
		super();
		this.username = username;
		this.nombreArticle = nombreArticle;
		this.email = email;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNombreArticle() {
		return nombreArticle;
	}
	public void setNombreArticle(int nombreArticle) {
		this.nombreArticle = nombreArticle;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
		
}

	

