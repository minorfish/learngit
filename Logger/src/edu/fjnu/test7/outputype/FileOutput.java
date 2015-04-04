/**
 * 
 */
package edu.fjnu.test7.outputype;

/**
 * @author guoyumei
 *
 */
public class FileOutput implements OutputType {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.outputype.outputType#output(java.lang.String, java.lang.String)
	 */
	@Override
	public void output(String osType, String lang) {
		System.out.println("现在是在"+osType+"操作系统上支持"+lang+"语言以文件的方式输出！");

	}

}
