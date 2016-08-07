package com.liberation.entry;

public class User {
	private String userName; // 用户名
	private String userPwd; // 用户密码
	private int userAge; // 用户年龄
	private String userNickName; // 用户昵称

	// 构造函数
	public User(String userName, String userPwd, int userAge,
			String userNickName) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAge = userAge;
		this.userNickName = userNickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

}
