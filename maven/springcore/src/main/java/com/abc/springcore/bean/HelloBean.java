package com.abc.springcore.bean;

public class HelloBean {
	public String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void sayHello() {
		System.out.println("MSG: " + msg);
	}
}
