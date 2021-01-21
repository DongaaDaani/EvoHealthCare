package evohealthcare.backend.login;

class User {
	String username;
	String password;
	String email;
	String name;

	protected User(String username, String password, String email, String name) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
	}

	protected String getUsername() {
		return username;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{\"username\":\""+username+"\",\"password\":\""+password+"\",\"email\":\""+email+"\",\"name\":\""+name+"\"}";
	}
	
}
