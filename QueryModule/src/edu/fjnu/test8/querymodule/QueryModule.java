package edu.fjnu.test8.querymodule;

import edu.fjnu.test8.permission.Permission;

public class QueryModule {

	public void setPermission(Permission permission, Integer level) {
		this.permission = permission;
		this.permission.setLevel(level);
	}

	public void queryInformation() {
		this.permission.queryInfomation();
	}
	
	public void recordQueryLog() {
		this.permission.recordQueryLog();
	}
	
	private Permission permission;
}
