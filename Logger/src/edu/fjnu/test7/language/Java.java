/**
 * 
 */
package edu.fjnu.test7.language;

/**
 * @author guoyumei
 *
 */
public class Java extends Language {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.language.language#choseLanguage(java.lang.String)
	 */
	@Override
	public void choseLanguage(String osType) {
		super.output.output(osType, "Java");
	}

}
