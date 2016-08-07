package com.liberation.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.User;
import com.liberation.show.Show;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date 创建时间：2016年7月23日 上午9:05:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class Check {
	// 存储当前用户 并提供一个默认值
	public static User userTeamp = new User(null, null, 0, null); // 用于存储当前登录用户的信息

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<User> user = DataProvider.user;

	// 用户注册
	public static void register() {
		// TODO Auto-generated method stub
		String userName = "";// 存放输入的用户名
		String userPwd = ""; // 存放输入的密码
		boolean flag = false; // 判断退出条件
		System.out.println("请输入用户名：");
		userName = sc.next();
		do { // 循环判断用户名是否为已存在
			for (int i = 0; i < user.size(); i++) {
				if (user.get(i).getUserName().equals(userName)) {
					System.err.println("用户已存在！请重新输入用户名：");
					userName = sc.next();
					flag = true;

				} else {
					flag = false;
				}
			}
		} while (flag);
		System.out.println("请输入您的昵称：");
		String userNickName = sc.next();
		System.out.println("请输入输入年龄：");
		int userAge = sc.nextInt();
		do {
			if (userAge < 0 || userAge > 120) {
				System.err.println("年龄不能为负数！请重新输入：");
				userAge = sc.nextInt();
				flag = true;
			} else {
				flag = false;
			}
		} while (flag);
		do {
			System.out.println("请输入密码：");
			userPwd = sc.next();
			do {
				if (userPwd.length() < 6) {
					System.err.println("密码长度至少6位！请重新输入：");
					userPwd = sc.next();
					flag = true;
				} else {
					flag = false;
				}
			} while (flag);
			System.out.println("请再次输入密码：");
			String pwd2 = sc.next();
			if (!userPwd.equals(pwd2)) {
				System.err.println("两次输入的密码不一致，请重新输入：");
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);
		User newUser = new User(userName, userPwd, userAge, userNickName);
		user.add(newUser);
		System.out.println("恭喜您,注册成功！");
		Show.userShow(newUser);

	}

	// 用户登录
	public static boolean userLogin() {
		String userName;
		boolean flag = false;
		do {
			System.out.println("请输入用户名：");
			userName = sc.next();
			System.out.println("请输入密码：");
			String pwd2 = sc.next();
			for (int i = 0; i < user.size(); i++) {
				if (user.get(i).getUserName().equals(userName)
						&& user.get(i).getUserPwd().equals(pwd2)) {
					System.out.println("登陆成功！");
					userTeamp = user.get(i);
					flag = false;
					break;

				} else {
					System.out.println("您输入的用户名或者密码不正确，请重新输入");
					flag = true;
				}
			}
		} while (flag);
		return true;
	}

}
