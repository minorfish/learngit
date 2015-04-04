/**
 * 
 */
package edu.fjnu.test8.antivirus;

import edu.fjnu.test8.elements.Element;

/**
 * @author guoyumei
 *
 */
public class AntivirusSoftware {
	
	public void antivirus() {
		System.out.println("系统开始杀毒：");
		this.element.antivirus();
	}
	
	public void setElement(Element element) {
		this.element = element;
	}
	
	private Element element;
}
