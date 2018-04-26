package com.imooc;
//1,定义一个类
public class Telphone {
//2,属性（成员变量）有什么
	float screen;
	float cpu;
	float mem;
	//3，方法  干什么
	void call(){
		System.out.println("它可以打电话");
	}
	void seedmessage(){
		System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+"它可以发信息");
	}
}
