
package com.day02.pa01;

import com.day02.teah;

/**
 * ����Ա��
 * ����Ա����н������������Ա����Ŀ���𣬹�����Ա�ķֺ죩
 * @author Grace
 *
 */
public class EmpUtil {
	public static void main(String[] args) {
		Administrator admin=new Administrator();
		admin.setName("����");
	    fireEmp(admin);
	    Tech t=new Tech();
	    t.setSal(10);
	    t.setComm(1);
	  System.out.println( t.getTotalSal());
	}
	//����Ա��
	public static void fireEmp(Emp emp){
		System.out.println(emp.getName()+"��������");
	}
	//����Ա����н
	public static double getTotalSal(Emp emp){
		double result=0;
	/*	if(emp instanceof Administrator){
			result=emp.getSal()*12;
		}else if(emp instanceof Manager){
			Manager m=(Manager)emp;
			result=m.getSal()*12*(1+m.getBounds());
		}else if(emp instanceof Tech){
			Tech t=(Tech)emp;
			result=t.getSal()*12+t.getComm();
		}*/
		return result;
	}
}
