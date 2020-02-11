package com.wjy.two.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.wjy.two.CollectionUtil;
import com.wjy.two.FileUtil;
import com.wjy.two.RandomUtil;
import com.wjy.two.StringUtil;

//测试类
public class TestUtil {

	@Test
	public void Test() {
		
		String str = "123654789";
		boolean b1 = StringUtil.isNull(str);
		System.out.println("判断字符串是否为空"+b1);
		boolean b2 = StringUtil.isEmail(str);
		System.out.println("判断字符串是否为邮箱"+b2);
		boolean b3 = StringUtil.isPhoneNum(str);
		System.out.println("判断字符串是否为手机号"+b3);
		
		List<String>list = new ArrayList<String>();
		boolean b4 = CollectionUtil.isNull(list);
		System.out.println("判断集合是否位空"+b4);
		
		String fileName = "D:\\yy.txt";
		List<String> fileToList = FileUtil.readTextFileToList(fileName);
		System.out.println("读取传入的文件"+fileToList);
		
		int random = RandomUtil.random(1, 120);
		System.out.println("返回某个时间段的数据"+random);
		for (int i = 0; i < 4; i++) {
			System.out.println("返回四位验证码"+RandomUtil.randomChar()); 
		}
		
		
	}
	
	
	
}
