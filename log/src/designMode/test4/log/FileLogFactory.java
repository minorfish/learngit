/**
 * 
 */
package designMode.test4.log;

/**
 * @author guoyumei
 *
 */
public class FileLogFactory implements LogFactory {

	/* (non-Javadoc)
	 * @see designMode.test4.log.LogFactory#createLog()
	 */
	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		System.out.println("文件日志工厂生产文件日志");
		return new FileLog();
	}

}
