package com.liberation.data;

import java.util.ArrayList;

import com.liberation.entry.Product;
import com.liberation.entry.User;
import com.liberation.utils.*;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date 创建时间：2016年7月23日 上午8:53:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class DataProvider {
	// 用户列表
	public static ArrayList<User> user = new ArrayList<User>();
	// 保存产品信息
	public static ArrayList<Product> list = new ArrayList<Product>();
	// 保存产品信息
	public static ArrayList<Product> buylist = new ArrayList<Product>();

	// 初始化产品列表
	public static void init() {
		list.add(new Product("10101", "格力空调", 2888.9, 32));
		list.add(new Product("10102", "海尔冰箱", 3689.99, 15));
		list.add(new Product("10103", "美的冰箱", 1999.9, 30));
		list.add(new Product("10104", "格力冰箱", 2108.9, 25));
		list.add(new Product("10105", "海尔空调", 1888.0, 2));
		list.add(new Product("10106", "美的空调", 4898.2, 0));
		list.add(new Product("10107", "长虹电视", 1808.6, 55));
		list.add(new Product("10108", "长虹冰箱", 2100.0, 18));
		user.add(new User("liberation", "1234", 18, "henry")); // 默认一个登录名
	}

}
