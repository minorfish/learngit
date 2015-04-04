/**
 * 
 */
package edu.fjnu.test8.permission;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author guoyumei
 *
 */
public class PermissionProxy implements Permission {

	static {
		PermissionProxy.map = new HashMap<Integer, Integer>();
	}
	@Override
	public void setRealPermission(RealPermission realPermission) {
		this.realPermission = realPermission;
	}
	
	@Override
	public void queryInfomation() {	
		if (this.level == 0) {
			System.out.println("对不起，你没有查询的权限！");
		} else if (this.level == 1) {
			System.out.println("查询信息：");
			this.realPermission.queryInfomation();
		
			Integer queryNum = 0;
			if (PermissionProxy.map.containsKey(this.realPermission.getId()))
				queryNum = PermissionProxy.map.get(this.realPermission.getId());
			
			PermissionProxy.map.put(this.realPermission.getId(), queryNum+1);
		}
	}

	@Override
	public void recordQueryLog() {
		Iterator it =  PermissionProxy.map.entrySet().iterator();
		System.out.println("用户查询日志：");
		while (it.hasNext()){
			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)it.next();
			System.out.println("用户ID："+entry.getKey()+",该用户查询次数:"+entry.getValue());
		}

	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	private RealPermission realPermission;
	private static Map<Integer, Integer> map;
	private Integer level;
	
}
