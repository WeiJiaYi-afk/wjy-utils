package com.wjy.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//流处理工具类
public class FileUtil {

	//
	//读取文件到集合list中
	public static List<String> readTextFileToList(String fileName){
		//创建集合
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			do {
				String readLine = br.readLine();
				list.add(readLine);
			}while(br.read()!=-1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;	
	}
	
	
}
