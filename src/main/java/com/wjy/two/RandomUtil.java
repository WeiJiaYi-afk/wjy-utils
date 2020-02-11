package com.wjy.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//随机数工具类
public class RandomUtil {

	//返回某个时间段的数据(返回年龄在1-120之间)
	public static int random(int min, int max) {
		Random random = new Random();
		int nextInt = random.nextInt(max-min+1);
		if(nextInt<min) {
			return random(min,max);
		}
		return nextInt;
	}

	//返回4位验证码，可包含数字和字母
	public static char randomChar() {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}
	
	//随机返回一段文章(至少500字)
	
}
