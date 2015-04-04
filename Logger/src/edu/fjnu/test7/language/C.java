/**
 * 
 */
package edu.fjnu.test7.language;

/**
 * @author guoyumei
 *
 */
public class C extends Language {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.language.language#choseLanguage()
	 */
	@Override
	public void choseLanguage(String osType) {	
		super.output.output(osType, "C");
	}
}
