package com.liberation.entry;

public class User {
	private String userName; // �û���
	private String userPwd; // �û�����
	private int userAge; // �û�����
	private String userNickName; // �û��ǳ�

	// ���캯��
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
