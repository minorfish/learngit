/**
 * 
 */
package edu.fjnu.test8.permission;

/**
 * @author guoyumei
 *
 */
public interface Permission {
	void queryInfomation();
	void recordQueryLog();
	void setLevel(Integer level);
	void setRealPermission(RealPermission realPermission);
}
