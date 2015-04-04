/**
 * 
 */
package designMode.test4.log;

/**
 * @author guoyumei
 *
 */
public class DatabaseLogFactory implements LogFactory {

	/* (non-Javadoc)
	 * @see designMode.test4.log.LogFactory#createLog()
	 */
	@Override
	public Log createLog() {
		// TODO Auto-generated method stub
		System.out.println("数据库日志工厂生产数据库日志");
		return new DatabaseLog();
	}

}
