package com.liberation.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.User;
import com.liberation.show.Show;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����9:05:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class Check {
	// �洢��ǰ�û� ���ṩһ��Ĭ��ֵ
	public static User userTeamp = new User(null, null, 0, null); // ���ڴ洢��ǰ��¼�û�����Ϣ

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<User> user = DataProvider.user;

	// �û�ע��
	public static void register() {
		// TODO Auto-generated method stub
		String userName = "";// ���������û���
		String userPwd = ""; // ������������
		boolean flag = false; // �ж��˳�����
		System.out.println("�������û�����");
		userName = sc.next();
		do { // ѭ���ж��û����Ƿ�Ϊ�Ѵ���
			for (int i = 0; i < user.size(); i++) {
				if (user.get(i).getUserName().equals(userName)) {
					System.err.println("�û��Ѵ��ڣ������������û�����");
					userName = sc.next();
					flag = true;

				} else {
					flag = false;
				}
			}
		} while (flag);
		System.out.println("�����������ǳƣ�");
		String userNickName = sc.next();
		System.out.println("�������������䣺");
		int userAge = sc.nextInt();
		do {
			if (userAge < 0 || userAge > 120) {
				System.err.println("���䲻��Ϊ���������������룺");
				userAge = sc.nextInt();
				flag = true;
			} else {
				flag = false;
			}
		} while (flag);
		do {
			System.out.println("���������룺");
			userPwd = sc.next();
			do {
				if (userPwd.length() < 6) {
					System.err.println("���볤������6λ�����������룺");
					userPwd = sc.next();
					flag = true;
				} else {
					flag = false;
				}
			} while (flag);
			System.out.println("���ٴ��������룺");
			String pwd2 = sc.next();
			if (!userPwd.equals(pwd2)) {
				System.err.println("������������벻һ�£����������룺");
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);
		User newUser = new User(userName, userPwd, userAge, userNickName);
		user.add(newUser);
		System.out.println("��ϲ��,ע��ɹ���");
		Show.userShow(newUser);

	}

	// �û���¼
	public static boolean userLogin() {
		String userName;
		boolean flag = false;
		do {
			System.out.println("�������û�����");
			userName = sc.next();
			System.out.println("���������룺");
			String pwd2 = sc.next();
			for (int i = 0; i < user.size(); i++) {
				if (user.get(i).getUserName().equals(userName)
						&& user.get(i).getUserPwd().equals(pwd2)) {
					System.out.println("��½�ɹ���");
					userTeamp = user.get(i);
					flag = false;
					break;

				} else {
					System.out.println("��������û����������벻��ȷ������������");
					flag = true;
				}
			}
		} while (flag);
		return true;
	}

}
