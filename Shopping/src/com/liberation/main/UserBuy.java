package com.liberation.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.Product;
import com.liberation.show.Show;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date 创建时间：2016年7月23日 下午1:03:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class UserBuy {
	// 购买商品
	public static void buy() {
		int buyNum = 0; // 当前购买商品的数量
		int buyListStock = 0 ;
		int buylistindex = 0 ;
		int maxBuyNum = 0 ; //最大能买的个数
        boolean flag1 = true ;
		boolean flag = false;
		boolean flag2 = true ;
		boolean flag3 = false;
		int index =0 ;// 记录找到的下标
		
		ArrayList<Product> list = DataProvider.list;
		ArrayList<Product> buylist = DataProvider.buylist;
		Scanner sc = new Scanner(System.in);
		
		while(flag2){
			//循环一次重置循环条件
			flag = false ;
		    flag1 = true ;
		    flag3 = false;
			Show.productShow(DataProvider.list);
			System.out.println("请输入你要购买的商品编号：");
			String chose = sc.next();
			// 不存在无法购买
			for (int i = 0; i < list.size(); i++) { // 遍历产品列表
				// 库存为0无法购买
				if (chose.equals(list.get(i).getId())) {
					//System.out.println("已找到商品...");
					if (list.get(i).getStock() == 0) {
						System.out.println("库存为0无法购买！");
						flag = false ; //有但是库存为0
					
					}else{
						index = i;   //找到符合的上商品记录该商品编号
						flag = true ; //有找到且库存不为0
						//System.out.println("找到了库存不为0");
						
					}
					break ; //找到商品结束遍历
				}else{
					if(i==list.size()-1){ //遍历次数为商品长度-1说面无法找到
					System.out.println("所找的商品不存在！");
					flag = false ;}
				}
				//System.out.println("我走到这了");

			}
			  //找到且库存不为0
			  if (flag) {
				  //System.out.println("我进到库存不为0的判断了..");
				  while(flag1){  
					   // System.out.println("进来了..");
						System.out.println("请输入需要购买的数量");
						buyNum = sc.nextInt();
						for (int i = 0; i < buylist.size(); i++) {
							if(chose.equals(buylist.get(i).getId())){
								//找到购物车已存在记录下标 获取该商品的数量
								buylistindex = i; //记录该商品所在下标
								buyListStock = buylist.get(i).getStock(); //记录购物购物车该商品数量
								flag3 = true ; //记录找到
								//System.out.println("购物车中存在");
								
							}else{
								if(i==buylist.size()-1){
								flag3 = false ; //购物车不存在
								//System.out.println("购物车中没有");
								}
							}
							
						}
						if(flag3){
							//已在购物车存在
							//System.out.println("购物车中");
							if((buyListStock+buyNum)>list.get(index).getStock()){
								
								System.out.println("该商品库存不足！您最多还能能购买："+(list.get(index).getStock()-buyListStock));
								flag1 = true ;
								
							}else{
								buylist.get(buylistindex).setStock(buyListStock+buyNum) ; //购物车找到且数量足够 直接添加购买数量
								Show.buyListShow(buylist); //购买成功，展示一波
								flag1 = false ;
								break ;
								
							}
						}
						
						
						if(!flag3){
							//购物车找不到那么直接添加
		                      if((buyNum)>list.get(index).getStock()){
		                    	flag1 = true ;
								System.out.println("该商品库存不足！您最多还能能购买："+(list.get(index).getStock()));
						
							}else{
								buylist.add(new Product(chose, list.get(index).getName(), list.get(index).getPrice(), buyNum)) ; //购物车找到且数量足够 直接添加购买数量
								Show.buyListShow(buylist); //购买成功，展示一波
		                        break ;
								
							}
							
							
						}
							
						}
				  
			  }
				

						
			System.out.println("是否继续购买？ y/Y 继续购买 其它任意键退出");
			String next = sc.next();
			if (next.equals("y") || next.equals("Y")) {
				flag2 = true;
			} else {
				flag2 = false;
			}
		} 
		
	}
}
