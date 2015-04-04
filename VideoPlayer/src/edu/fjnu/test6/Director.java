/**
 * 
 */
package edu.fjnu.test6;

/**
 * @author guoyumei
 *
 */
public class Director {
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public Item construct(){
		this.builder.getCollection();
		this.builder.getControlBar();
		this.builder.getMainWindow();
		this.builder.getMenu();
		this.builder.getPlayList();
		return this.builder.getItem();
	}
	
	private Builder builder;
}
