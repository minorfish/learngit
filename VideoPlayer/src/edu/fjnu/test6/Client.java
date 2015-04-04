/**
 * 
 */
package edu.fjnu.test6;

import edu.fjnu.test6.xmlutil.XMLUtil;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = (Builder) XMLUtil.getBean();
		Director director = new Director (builder);
		builder.showMode();
		Item item = director.construct();
		item.showMode();
		
	}

}
