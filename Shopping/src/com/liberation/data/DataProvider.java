package com.liberation.data;

import java.util.ArrayList;

import com.liberation.entry.Product;
import com.liberation.entry.User;
import com.liberation.utils.*;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����8:53:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class DataProvider {
	// �û��б�
	public static ArrayList<User> user = new ArrayList<User>();
	// �����Ʒ��Ϣ
	public static ArrayList<Product> list = new ArrayList<Product>();
	// �����Ʒ��Ϣ
	public static ArrayList<Product> buylist = new ArrayList<Product>();

	// ��ʼ����Ʒ�б�
	public static void init() {
		list.add(new Product("10101", "�����յ�", 2888.9, 32));
		list.add(new Product("10102", "��������", 3689.99, 15));
		list.add(new Product("10103", "���ı���", 1999.9, 30));
		list.add(new Product("10104", "��������", 2108.9, 25));
		list.add(new Product("10105", "�����յ�", 1888.0, 2));
		list.add(new Product("10106", "���Ŀյ�", 4898.2, 0));
		list.add(new Product("10107", "�������", 1808.6, 55));
		list.add(new Product("10108", "�������", 2100.0, 18));
		user.add(new User("liberation", "1234", 18, "henry")); // Ĭ��һ����¼��
	}

}
