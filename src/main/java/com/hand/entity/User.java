package com.hand.entity;

public class User extends IdEntiry {
	private String name;
	private String password;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//在自动生成中生成toString 记得要加上父类的id字段。
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", id=" + id + "]";
	}

}
