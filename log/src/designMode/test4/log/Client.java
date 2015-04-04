/**
 * 
 */
package designMode.test4.log;

import edu.fjnu.test5.XMLUtil;

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
		try{
			
			Log log;
			LogFactory factory;
			factory = (LogFactory) XMLUtil.getBean();
			log = factory.createLog();
			log.writeLog();
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
