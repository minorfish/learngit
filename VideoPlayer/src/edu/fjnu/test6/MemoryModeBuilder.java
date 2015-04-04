/**
 * 
 */
package edu.fjnu.test6;

/**
 * @author guoyumei
 *
 */
public class MemoryModeBuilder extends Builder {

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getMenu()
	 */
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		super.getItem().setMenu(false);
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test6.Builder#getPlayList()
	 */
	@Override
	public void getPlayList() {
		// TODO Auto-generated method stub
		super.getItem().setPlayList(false);
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
		super.getItem().setControlBar(true);
	}
	public void showMode() {
		System.out.println("记忆模式：");
	}
}
