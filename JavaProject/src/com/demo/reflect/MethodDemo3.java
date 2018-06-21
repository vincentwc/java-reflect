package com.demo.reflect;

public class MethodDemo3 {

	public static void main(String[] args) {
		User user = new User("zhangsan", "123456", 18);
		System.out.println(BeanUtil.getValueByPropertyName(user, "username"));
		System.out.println(BeanUtil.getValueByPropertyName(user, "userpass"));
	}
}
