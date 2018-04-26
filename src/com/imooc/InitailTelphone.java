package com.imooc;

public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Telphone phone=new Telphone();
phone.seedmessage();
//给实例变量赋值
phone.screen=3.0f;
phone.cpu=2.0f;
phone.mem=1.5f;
//调用实例的方法
phone.seedmessage();

	}

}
