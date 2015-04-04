/**
 * 
 */
package edu.fjnu.test7.logger;


/**
 * @author guoyumei
 *
 */
public class WindowsLogger extends Logger {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.language.Language#choseLanguage(java.lang.String)
	 */
	@Override
	public void log() {
		System.out.println("日志记录器工作环境说明：");
		super.lang.choseLanguage("Windows");
	}
}
