package com.day01;
/**
 *���ݸ��������֤�ţ��ж��Ա�
 *1.ȡ�õ�17λ
 *2.�ж���ż
 *3.����жϽ�� 
 *
 */
public class TestIf {
public static void main(String[] args) {
	String id="61040319930118302X";
//	ǰ�պ󿪡�
    String subId=id.substring(16, 17);
    int num=Integer.parseInt(subId);
	if(num%2==0){
		System.out.println("�Ա�ΪŮ");
	}else{
		System.out.println("�Ա�Ϊ��");
	}
	System.out.println("��������");
}
}
