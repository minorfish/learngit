/**
 * 
 */
package edu.fjnu.test8.elements;

/**
 * @author guoyumei
 *
 */
public class ImageFile extends Element {

	/* (non-Javadoc)
	 * @see edu.fjnu.test8.elements.File#antivirus()
	 */
	@Override
	public void antivirus() {	
		System.out.println("杀毒图片文件:"+fileName);
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	private String fileName;
}
