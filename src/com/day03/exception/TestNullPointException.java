package com.day03.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ���ʱ�쳣��������ʱ�쳣����������쳣�Ĵ���
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
		} finally{//�϶���ִ�еĴ��룬һ������ʱ�ļ��Ĵ������Դ�Ĺر�
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
