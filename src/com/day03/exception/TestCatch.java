package com.day03.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestCatch {
	public static void main(String[] args) {
		try {
			String s = null;
			char ch = s.charAt(0);
			FileInputStream f = new FileInputStream(new File("E:/a."));
			String s2 = "abc";
			Integer.parseInt(s2);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		
		System.out.println(m());
	}
	/**
	 * finally��ִ��.
���������˵,������˳�򻯵�һֱ������,
��������,������Rerurn(��δִ��),��֪��������ȥ��,����ǰ.����ȥ��Finally,��Finally����������.
���������Debug��ʱ��Ƚ�����,�ߵ�Return������,�ͽ�Finally,Ȼ���ڻص�Rerurn,������
	 * @return
	 */
	public static int m(){
		String s=null;
		try {
			char ch=s.charAt(0);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 2;
		}finally{
			return 3;
		}
	}
}
