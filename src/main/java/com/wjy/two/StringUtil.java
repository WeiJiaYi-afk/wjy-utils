package com.wjy.two;

//字符串处理工具类
public class StringUtil {

	//判断字符串是否为空
	public static boolean isNull(String str) {
		if(str==null) {
			return true;
		}
		//去空格后，如果为“ ”，返回true
		str = str.trim();
		if("".equals(str)) {
			return true;
		}
		//否则不为空
		return false;
	}
	
	//判断字符串是否为邮箱
	public static boolean isEmail(String str) {
		//regex为正则表达式
		String regex = "\\w+@\\w+.(com|cn|com.cn|net)";
		//matches为正则校验
		return str.matches(regex);
	}
	
	//判断字符串是否为手机号
	public static boolean isPhoneNum(String str) {
		//regex为正则表达式
		String regex = "1[3578]\\d{9}";
		//matches为正则校验
		return str.matches(regex);
	}
	
	
}
