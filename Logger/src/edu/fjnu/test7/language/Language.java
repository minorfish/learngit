/**
 * 
 */
package edu.fjnu.test7.language;

import edu.fjnu.test7.outputype.OutputType;

/**
 * @author guoyumei
 *
 */
public abstract class Language {
	protected OutputType output;

	public void setOutput(OutputType output) {
		this.output = output;
	}	
	public abstract void choseLanguage(String osType);
}
