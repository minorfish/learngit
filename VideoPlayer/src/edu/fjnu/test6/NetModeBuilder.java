/**
 * 
 */
package edu.fjnu.test6;

/**
 * @author guoyumei
 *
 */
public class NetModeBuilder extends Builder {

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getMenu()
	 */
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		super.getItem().setMenu(true);
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getPlayList()
	 */
	@Override
	public void getPlayList() {
		// TODO Auto-generated method stub
		super.getItem().setPlayList(true);
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getMainWindow()
	 */
	@Override
	public void getMainWindow() {
		// TODO Auto-generated method stub
		super.getItem().setMainWindow(true);
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getCollection()
	 */
	@Override
	public void getCollection() {
		// TODO Auto-generated method stub
		super.getItem().setCollection(true);
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getControlBar()
	 */
	@Override
	public void getControlBar() {
		// TODO Auto-generated method stub
		super.getItem().setControlBar(false);
	}

	public void showMode() {
		System.out.println("网络模式：");
	}
}
