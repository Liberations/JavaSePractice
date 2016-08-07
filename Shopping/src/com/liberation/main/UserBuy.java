package com.liberation.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.liberation.data.DataProvider;
import com.liberation.entry.Product;
import com.liberation.show.Show;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����1:03:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class UserBuy {
	// ������Ʒ
	public static void buy() {
		int buyNum = 0; // ��ǰ������Ʒ������
		int buyListStock = 0 ;
		int buylistindex = 0 ;
		int maxBuyNum = 0 ; //�������ĸ���
        boolean flag1 = true ;
		boolean flag = false;
		boolean flag2 = true ;
		boolean flag3 = false;
		int index =0 ;// ��¼�ҵ����±�
		
		ArrayList<Product> list = DataProvider.list;
		ArrayList<Product> buylist = DataProvider.buylist;
		Scanner sc = new Scanner(System.in);
		
		while(flag2){
			//ѭ��һ������ѭ������
			flag = false ;
		    flag1 = true ;
		    flag3 = false;
			Show.productShow(DataProvider.list);
			System.out.println("��������Ҫ�������Ʒ��ţ�");
			String chose = sc.next();
			// �������޷�����
			for (int i = 0; i < list.size(); i++) { // ������Ʒ�б�
				// ���Ϊ0�޷�����
				if (chose.equals(list.get(i).getId())) {
					//System.out.println("���ҵ���Ʒ...");
					if (list.get(i).getStock() == 0) {
						System.out.println("���Ϊ0�޷�����");
						flag = false ; //�е��ǿ��Ϊ0
					
					}else{
						index = i;   //�ҵ����ϵ�����Ʒ��¼����Ʒ���
						flag = true ; //���ҵ��ҿ�治Ϊ0
						//System.out.println("�ҵ��˿�治Ϊ0");
						
					}
					break ; //�ҵ���Ʒ��������
				}else{
					if(i==list.size()-1){ //��������Ϊ��Ʒ����-1˵���޷��ҵ�
					System.out.println("���ҵ���Ʒ�����ڣ�");
					flag = false ;}
				}
				//System.out.println("���ߵ�����");

			}
			  //�ҵ��ҿ�治Ϊ0
			  if (flag) {
				  //System.out.println("�ҽ�����治Ϊ0���ж���..");
				  while(flag1){  
					   // System.out.println("������..");
						System.out.println("��������Ҫ���������");
						buyNum = sc.nextInt();
						for (int i = 0; i < buylist.size(); i++) {
							if(chose.equals(buylist.get(i).getId())){
								//�ҵ����ﳵ�Ѵ��ڼ�¼�±� ��ȡ����Ʒ������
								buylistindex = i; //��¼����Ʒ�����±�
								buyListStock = buylist.get(i).getStock(); //��¼���ﹺ�ﳵ����Ʒ����
								flag3 = true ; //��¼�ҵ�
								//System.out.println("���ﳵ�д���");
								
							}else{
								if(i==buylist.size()-1){
								flag3 = false ; //���ﳵ������
								//System.out.println("���ﳵ��û��");
								}
							}
							
						}
						if(flag3){
							//���ڹ��ﳵ����
							//System.out.println("���ﳵ��");
							if((buyListStock+buyNum)>list.get(index).getStock()){
								
								System.out.println("����Ʒ��治�㣡����໹���ܹ���"+(list.get(index).getStock()-buyListStock));
								flag1 = true ;
								
							}else{
								buylist.get(buylistindex).setStock(buyListStock+buyNum) ; //���ﳵ�ҵ��������㹻 ֱ����ӹ�������
								Show.buyListShow(buylist); //����ɹ���չʾһ��
								flag1 = false ;
								break ;
								
							}
						}
						
						
						if(!flag3){
							//���ﳵ�Ҳ�����ôֱ�����
		                      if((buyNum)>list.get(index).getStock()){
		                    	flag1 = true ;
								System.out.println("����Ʒ��治�㣡����໹���ܹ���"+(list.get(index).getStock()));
						
							}else{
								buylist.add(new Product(chose, list.get(index).getName(), list.get(index).getPrice(), buyNum)) ; //���ﳵ�ҵ��������㹻 ֱ����ӹ�������
								Show.buyListShow(buylist); //����ɹ���չʾһ��
		                        break ;
								
							}
							
							
						}
							
						}
				  
			  }
				

						
			System.out.println("�Ƿ�������� y/Y �������� ����������˳�");
			String next = sc.next();
			if (next.equals("y") || next.equals("Y")) {
				flag2 = true;
			} else {
				flag2 = false;
			}
		} 
		
	}
}
