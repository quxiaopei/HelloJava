
package com.day02.pa01;

import com.day02.teah;

/**
 * 开除员工
 * 计算员工年薪（包括技术人员的项目奖金，管理人员的分红）
 * @author Grace
 *
 */
public class EmpUtil {
	public static void main(String[] args) {
		Administrator admin=new Administrator();
		admin.setName("张三");
	    fireEmp(admin);
	    Tech t=new Tech();
	    t.setSal(10);
	    t.setComm(1);
	  System.out.println( t.getTotalSal());
	}
	//开除员工
	public static void fireEmp(Emp emp){
		System.out.println(emp.getName()+"被开除了");
	}
	//计算员工年薪
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
