/**
 * 
 */
package edu.fjnu.test7.robot;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = (Robot)XMLUtil.getBean();
		robot.cry();
		robot.run();
	}

}
