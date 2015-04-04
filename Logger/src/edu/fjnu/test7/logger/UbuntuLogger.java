/**
 * 
 */
package edu.fjnu.test7.logger;

/**
 * @author guoyumei
 *
 */
public class UbuntuLogger extends Logger {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.logger.Logger#log()
	 */
	@Override
	public void log() {
		System.out.println("日志记录器工作环境说明：");
		super.lang.choseLanguage("Ubuntu");
	}

}
