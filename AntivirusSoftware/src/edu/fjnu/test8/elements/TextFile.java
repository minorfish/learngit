/**
 * 
 */
package edu.fjnu.test8.elements;

/**
 * @author guoyumei
 *
 */
public class TextFile extends Element {

	@Override
	public void antivirus() {
		System.out.println("杀毒文本文件:"+fileName);
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private String fileName;
}
