package com.wjy.two;

import java.util.Collection;

//集合工具类
public class CollectionUtil {

	//判断集合类是否为空
	public static boolean isNull(Collection<?> collection) {
		
		return collection == null || collection.size()==0;
	}
}
