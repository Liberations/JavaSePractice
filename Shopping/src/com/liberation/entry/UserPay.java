package com.liberation.entry;

/**
 * 
 * @author Liberation E-mail: 910689331@qq.com
 * @date ����ʱ�䣺2016��7��23�� ����2:59:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * 
 */
public class UserPay {
	private String PayType; // ֧����ʽ
	private double leftmoney;
	private String pwd; // ֧������
	//�ṩ���ָ��ʽһ�㲻���޸�
	private static UserPay userpay1 = new UserPay("֧����֧��", 100000, "123456");
	private static UserPay userpay2 = new UserPay("΢��֧��", 1000, "123456");

	public String getPayType() {
		return PayType;
	}

	public void setPayType(String payType) {
		PayType = payType;
	}

	public double getLeftmoney() {
		return leftmoney;
	}

	public void setLeftmoney(double leftmoney) {
		this.leftmoney = leftmoney;
	}

	private UserPay(String payType, double leftmoney, String pwd) {
		super();
		PayType = payType;
		this.leftmoney = leftmoney;
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static UserPay get(int i) {
		if (i == 1) {
			return userpay1;
		} else {
			return userpay2;
		}

	}

}
