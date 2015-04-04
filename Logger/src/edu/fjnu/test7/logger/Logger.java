/**
 * 
 */
package edu.fjnu.test7.logger;

import edu.fjnu.test7.language.Language;

/**
 * @author guoyumei
 *
 */
public abstract class Logger {
	protected Language lang;

	public void setLang(Language lang) {
		this.lang = lang;
	}
	public abstract void log();
	
}
