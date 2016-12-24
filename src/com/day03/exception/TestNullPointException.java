package com.day03.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 检测时异常（非运行时异常）必须进行异常的处理
 *
 */
public class TestNullPointException {
	public static void main(String[] args) {
		String s=null;
		FileInputStream is = null;
		if(s!=null){
			char c=s.charAt(0);
		}
		try {
		 is=new FileInputStream(new File("E:/123"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{//肯定会执行的代码，一般做临时文件的处理或资源的关闭
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
