package com.liberation.main;

/**
 *
 * @author  Liberation
 * E-mail:  910689331@qq.com
 * @date 创建时间：2016年7月23日 上午9:06:45
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
					.println("\n*********************电器商城*********************");
			System.out.println("\t\t   1、用户登录\n\t\t   2、用户注册\n\t\t   3、退出系统");
			System.out
					.println("*********************电器商城*********************");
			System.out.println("请选择你要进行的操作：");
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
				System.out.println("欢迎再次光临！");
				System.exit(1);
				break;
			default:
				System.out.println("输入错误请重新输入！");
			}

		}

	}

	private static void shpping() {
		// TODO Auto-generated method stub
		System.out.println("你好！\t\t\t" + Check.userTeamp.getUserName());

		while (true) {
			System.out
					.println("\n*********************电器商城*********************");
			System.out
					.println("\t\t   1、商品购买\n\t\t   2、我的购物车\n\t\t   3、个人信息\n\t\t   4、注销");
			System.out
					.println("*********************电器商城*********************");
			System.out.println("请选择你要进行的操作：");
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
				System.out.println("感谢您的使用！");
				main(null);
				break;
			default:
				System.out.println("输入错误请重新输入！");
			}
		}

	}
}
