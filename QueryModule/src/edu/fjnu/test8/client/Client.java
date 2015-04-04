/**
 * 
 */
package edu.fjnu.test8.client;

import edu.fjnu.test8.permission.Permission;
import edu.fjnu.test8.permission.RealPermission;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RealPermission realuser1 = new RealPermission();
		realuser1.setId(1);
		realuser1.setInfomation("我的姓名是木木，是福建师范大学的学生！");
		RealPermission realuser2 = new RealPermission();
		realuser2.setId(2);
		realuser2.setInfomation("我的姓名是小渔，是福州大学的学生！");
		RealPermission realuser3 = new RealPermission();
		realuser3.setId(3);
		realuser3.setInfomation("我的姓名是毛毛，是农林大学的学生！");
		
		Permission user;
		user = (Permission) XMLUtil.getBean();
		
		user.setRealPermission(realuser1);
		user.setLevel(1);
		user.queryInfomation();
		System.out.println();
		
		user.setRealPermission(realuser2);
		user.setLevel(1);
		user.queryInfomation();
		System.out.println();
		
		user.setRealPermission(realuser3);
		user.setLevel(1);
		user.queryInfomation();
		System.out.println();
		
		user.setRealPermission(realuser3);
		user.setLevel(1);
		user.queryInfomation();
		System.out.println();
		
		user.setRealPermission(null);
		user.setLevel(0);
		user.queryInfomation();
		System.out.println();
		
		user.recordQueryLog();
	}

}
