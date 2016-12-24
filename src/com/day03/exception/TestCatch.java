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
	 * finally先执行.
可以形象的说,方法在顺序化的一直往下走,
走着走着,发现了Rerurn(并未执行),它知道它快活不下去了,临死前.他就去找Finally,让Finally把事情做完.
这种情况在Debug的时候比较明显,走到Return所在行,就进Finally,然后在回到Rerurn,做返回
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
