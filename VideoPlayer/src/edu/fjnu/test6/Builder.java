/**
 * 
 */
package edu.fjnu.test6;

/**
 * @author guoyumei
 *
 */
public abstract class Builder {
	
	private Item item = new Item();
	public Item getItem() {
		return item;
	}
	public abstract void getMenu();
	public abstract void getPlayList();
	public abstract void getMainWindow();
	public abstract void getCollection();
	public abstract void getControlBar();
	public abstract void showMode();
}
