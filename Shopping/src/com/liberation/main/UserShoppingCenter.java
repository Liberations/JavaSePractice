package com.liberation.main;

import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.UserPay;
import com.liberation.show.Show;
import com.liberation.utils.Check;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date 创建时间：2016年7月23日 下午2:50:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class UserShoppingCenter {
	private static String pwd;

	public static void settleAccounts() { // 结算
		int i = 0;
		boolean flag = true;
		System.out.println("亲爱的" + Check.userTeamp.getUserName()
				+ "你的购物车物品详情为：");
		double sum = Show.buyListShow(DataProvider.buylist);
		System.out.println("是否结算？ y/Y 结算 其他任意键退出");
		Scanner sc = new Scanner(System.in);
		String chose = sc.next();
		do {
			if ("y".equals(chose) || "Y".equals(chose)) {
				System.out.println("请输入您的支付方式<1.支付宝支付  2.微信支付>");
				i = sc.nextInt();
				if (i == 1 || i == 2) {
					UserPay userpay = UserPay.get(i);
					System.out.println("你选择的是" + userpay.getPayType());
					System.out.println("请输入支付密码：");
					pwd = sc.next();
					if (userpay.getPwd().equals(pwd)) {
						System.out.println("请稍后...");
						if (userpay.getLeftmoney() >= sum) {
							userpay.setLeftmoney(userpay.getLeftmoney() - sum);
							System.out.println("支付成功！\n您的余额为："
									+ userpay.getLeftmoney());
							// 结束成功 将商城的物品数相应减少
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
							DataProvider.buylist.clear(); // 清空购物车准备下一次添加
						} else {
							System.out.println("余额不足请充值！");
						}
					} else {
						System.out.println("密码输入错误！");
					}
					flag = false;

				} else {
					System.out.println("你选择支付方式有误请重新选择！");

				}

			}
		} while (flag);

	}
}
