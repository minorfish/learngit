/**
 * 
 */
package edu.fjnu.test8.permission;

/**
 * @author guoyumei
 *
 */
public class RealPermission implements Permission {

	@Override
	public void queryInfomation() {
		System.out.println(this.infomation);
	}

	@Override
	public void recordQueryLog() {
	}
	
	
	@Override
	public void setLevel(Integer level) {
	}

	@Override
	public void setRealPermission(RealPermission realPermission) {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInfomation() {
		return infomation;
	}

	public void setInfomation(String infomation) {
		this.infomation = infomation;
	}
	
	private Integer id;
	private String infomation;
	
}
