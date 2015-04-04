package edu.fjnu.test7.test;

import edu.fjnu.test7.language.Language;
import edu.fjnu.test7.logger.Logger;
import edu.fjnu.test7.outputype.OutputType;
import edu.fjnu.test7.xmlutil.XMLUtil;

/**
 * 
 */

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = (Logger) XMLUtil.getBean("logger");
		Language lang = (Language) XMLUtil.getBean("language");
		OutputType type = (OutputType) XMLUtil.getBean("outputType");
		
		lang.setOutput(type);
		logger.setLang(lang);
		logger.log();
	}

}
