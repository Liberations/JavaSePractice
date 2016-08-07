package com.liberation.show;

import java.util.ArrayList;

import com.liberation.data.DataProvider;
import com.liberation.entry.*;
import com.liberation.utils.Check;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date 创建时间：2016年7月23日 上午10:23:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class Show {

	public static void userShow(User user) { // 个人信息展示

		System.out.println("用户名:" + user.getUserName() + "\t" + "昵称:"
				+ user.getUserNickName() + "\t" + "年龄：" + user.getUserAge()
				+ "\t" + "用户密码:" + user.getUserPwd() + "\t");
	}

	public static void productShow(ArrayList<Product> list) { // 商品展示
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品库存");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + "\t\t"
					+ list.get(i).getName() + "\t\t" + list.get(i).getPrice()
					+ "\t\t" + list.get(i).getStock());

		}

	}

	public static double buyListShow(ArrayList<Product> buylist) { // 购物清单
		double sum = 0;
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品数量");
		for (int i = 0; i < buylist.size(); i++) {
			System.out.println(buylist.get(i).getId() + "\t\t"
					+ buylist.get(i).getName() + "\t\t"
					+ buylist.get(i).getPrice() + "\t\t"
					+ buylist.get(i).getStock());
			sum += buylist.get(i).getPrice() * buylist.get(i).getStock();

		}

		System.out.println("总金额为：\t\t\t" + sum);
		return sum;
	}

	public static void userShow() { // 注册成功展示一波
		System.out.println("您的个人信息如下：");
		User user = Check.userTeamp;
		System.out.print("姓名：" + user.getUserName() + "\n" + "昵称："
				+ user.getUserNickName() + "\n" + "年龄：" + user.getUserAge()
				+ "\n" + "密码：" + user.getUserPwd());

	}

}
