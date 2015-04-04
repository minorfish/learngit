/**
 * 
 */
package edu.fjnu.test6;

/**
 * @author guoyumei
 *
 */
public class Item {
	
	private Boolean menu;
	private Boolean playList;
	private Boolean mainWindow;
	private Boolean controlBar;
	private Boolean collection;
	
	public Boolean getMenu() {
		return menu;
	}
	public void setMenu(Boolean menu) {
		this.menu = menu;
	}
	public Boolean getPlayList() {
		return playList;
	}
	public void setPlayList(Boolean playList) {
		this.playList = playList;
	}
	public Boolean getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(Boolean mainWindow) {
		this.mainWindow = mainWindow;
	}
	public Boolean getControlBar() {
		return controlBar;
	}
	public void setControlBar(Boolean controlBar) {
		this.controlBar = controlBar;
	}
	public Boolean getCollection() {
		return collection;
	}
	public void setCollection(Boolean collection) {
		this.collection = collection;
	}
	public void showMode() {
		
		if (this.menu)
			System.out.println("显示菜单");
		if(this.mainWindow)
			System.out.println("显示主窗口");
		if(this.collection)
			System.out.println("显示收藏列表");
		if(this.controlBar)
			System.out.println("显示控制条");
		if (this.playList)
			System.out.println("显示播放列表");
	}
	
}
