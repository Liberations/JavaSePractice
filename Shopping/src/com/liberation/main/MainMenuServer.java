package com.liberation.main;

/**
 *
 * @author  Liberation
 * E-mail:  910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����9:06:45
 * @version 1.0 
 * @parameter 
 * @since  
 * @return 
 * 
 */

import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.show.Show;
import com.liberation.utils.Check;

public class MainMenuServer {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataProvider.init();
		while (true) {
			System.out
					.println("\n*********************�����̳�*********************");
			System.out.println("\t\t   1���û���¼\n\t\t   2���û�ע��\n\t\t   3���˳�ϵͳ");
			System.out
					.println("*********************�����̳�*********************");
			System.out.println("��ѡ����Ҫ���еĲ�����");
			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose) {
			case 1:

				if (Check.userLogin()) {
					shpping();
				}
				;
				break;
			case 2:
				Check.register();
				break;
			case 3:
				System.out.println("��ӭ�ٴι��٣�");
				System.exit(1);
				break;
			default:
				System.out.println("����������������룡");
			}

		}

	}

	private static void shpping() {
		// TODO Auto-generated method stub
		System.out.println("��ã�\t\t\t" + Check.userTeamp.getUserName());

		while (true) {
			System.out
					.println("\n*********************�����̳�*********************");
			System.out
					.println("\t\t   1����Ʒ����\n\t\t   2���ҵĹ��ﳵ\n\t\t   3��������Ϣ\n\t\t   4��ע��");
			System.out
					.println("*********************�����̳�*********************");
			System.out.println("��ѡ����Ҫ���еĲ�����");
			int chose = sc.nextInt();
			switch (chose) {
			case 1:
				UserBuy.buy();
				break;
			case 2:
				UserShoppingCenter.settleAccounts();
				break;
			case 3:
				Show.userShow();
				break;
			case 4:
				System.out.println("��л����ʹ�ã�");
				main(null);
				break;
			default:
				System.out.println("����������������룡");
			}
		}

	}
}
