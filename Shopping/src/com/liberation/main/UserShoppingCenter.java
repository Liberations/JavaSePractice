package com.liberation.main;

import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.UserPay;
import com.liberation.show.Show;
import com.liberation.utils.Check;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����2:50:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class UserShoppingCenter {
	private static String pwd;

	public static void settleAccounts() { // ����
		int i = 0;
		boolean flag = true;
		System.out.println("�װ���" + Check.userTeamp.getUserName()
				+ "��Ĺ��ﳵ��Ʒ����Ϊ��");
		double sum = Show.buyListShow(DataProvider.buylist);
		System.out.println("�Ƿ���㣿 y/Y ���� ����������˳�");
		Scanner sc = new Scanner(System.in);
		String chose = sc.next();
		do {
			if ("y".equals(chose) || "Y".equals(chose)) {
				System.out.println("����������֧����ʽ<1.֧����֧��  2.΢��֧��>");
				i = sc.nextInt();
				if (i == 1 || i == 2) {
					UserPay userpay = UserPay.get(i);
					System.out.println("��ѡ�����" + userpay.getPayType());
					System.out.println("������֧�����룺");
					pwd = sc.next();
					if (userpay.getPwd().equals(pwd)) {
						System.out.println("���Ժ�...");
						if (userpay.getLeftmoney() >= sum) {
							userpay.setLeftmoney(userpay.getLeftmoney() - sum);
							System.out.println("֧���ɹ���\n�������Ϊ��"
									+ userpay.getLeftmoney());
							// �����ɹ� ���̳ǵ���Ʒ����Ӧ����
							for (int j = 0; j < DataProvider.buylist.size(); j++) {
								for (int j2 = 0; j2 < DataProvider.list.size(); j2++) {
									if (DataProvider.buylist
											.get(j)
											.getId()
											.equals(DataProvider.list.get(j2)
													.getId())) {
										DataProvider.list.get(j2).setStock(
												DataProvider.list.get(j2)
														.getStock()
														- DataProvider.buylist
																.get(j)
																.getStock());

									}
								}
							}
							DataProvider.buylist.clear(); // ��չ��ﳵ׼����һ�����
						} else {
							System.out.println("�������ֵ��");
						}
					} else {
						System.out.println("�����������");
					}
					flag = false;

				} else {
					System.out.println("��ѡ��֧����ʽ����������ѡ��");

				}

			}
		} while (flag);

	}
}
