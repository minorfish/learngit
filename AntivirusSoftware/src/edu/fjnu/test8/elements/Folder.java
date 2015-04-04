/**
 * 
 */
package edu.fjnu.test8.elements;

import java.util.ArrayList;

/**
 * @author guoyumei
 *
 */
public class Folder extends Element {

	/* (non-Javadoc)
	 * @see edu.fjnu.test8.elements.Element#antivirus()
	 */
	@Override
	public void antivirus() {
		System.out.println("杀毒文件夹："+this.fileName);
		
		for(Element element:list){
			element.antivirus();
		}
	}
	
	public boolean addFile(Element e) {
		return this.list.add(e);
	}
	
	public boolean removeFile(Element e) {
		return this.list.remove(e);
	}
	
	public Folder() {
		super();
		this.list = new ArrayList<Element>();
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private String fileName;
	private ArrayList<Element> list;
}
