/**
 * 
 */
package edu.fjnu.test7.outputype;

/**
 * @author guoyumei
 *
 */
public class ConsoleOutput implements OutputType {

	@Override
	public void output(String osType, String lang) {
		System.out.println("现在是在"+osType+"操作系统上支持"+lang+"语言以控制台的方式输出！");
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.outputype.outputType#output()
	 */
}
