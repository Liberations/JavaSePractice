package com.liberation.show;

import java.util.ArrayList;

import com.liberation.data.DataProvider;
import com.liberation.entry.*;
import com.liberation.utils.Check;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����10:23:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class Show {

	public static void userShow(User user) { // ������Ϣչʾ

		System.out.println("�û���:" + user.getUserName() + "\t" + "�ǳ�:"
				+ user.getUserNickName() + "\t" + "���䣺" + user.getUserAge()
				+ "\t" + "�û�����:" + user.getUserPwd() + "\t");
	}

	public static void productShow(ArrayList<Product> list) { // ��Ʒչʾ
		System.out.println("��Ʒ���\t\t��Ʒ����\t\t��Ʒ�۸�\t\t��Ʒ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + "\t\t"
					+ list.get(i).getName() + "\t\t" + list.get(i).getPrice()
					+ "\t\t" + list.get(i).getStock());

		}

	}

	public static double buyListShow(ArrayList<Product> buylist) { // �����嵥
		double sum = 0;
		System.out.println("��Ʒ���\t\t��Ʒ����\t\t��Ʒ�۸�\t\t��Ʒ����");
		for (int i = 0; i < buylist.size(); i++) {
			System.out.println(buylist.get(i).getId() + "\t\t"
					+ buylist.get(i).getName() + "\t\t"
					+ buylist.get(i).getPrice() + "\t\t"
					+ buylist.get(i).getStock());
			sum += buylist.get(i).getPrice() * buylist.get(i).getStock();

		}

		System.out.println("�ܽ��Ϊ��\t\t\t" + sum);
		return sum;
	}

	public static void userShow() { // ע��ɹ�չʾһ��
		System.out.println("���ĸ�����Ϣ���£�");
		User user = Check.userTeamp;
		System.out.print("������" + user.getUserName() + "\n" + "�ǳƣ�"
				+ user.getUserNickName() + "\n" + "���䣺" + user.getUserAge()
				+ "\n" + "���룺" + user.getUserPwd());

	}

}
