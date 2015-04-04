/**
 * 
 */
package designMode.test4.log;

/**
 * @author guoyumei
 *
 */
public class ConsoleLogFactory implements LogFactory {

	/* (non-Javadoc)
	 * @see designMode.test4.log.LogFactory#createLog()
	 */
	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		System.out.println("控制台日志工厂生产控制台日志");
		return new ConsoleLog();
	}

}
