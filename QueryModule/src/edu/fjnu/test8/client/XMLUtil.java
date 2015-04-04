/**
 * 
 */
package edu.fjnu.test8.client;

import java.io.File;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;   

/**
 * @author guoyumei
 *
 */
public class XMLUtil {
	
	public static Object getBean(){
		
		try{
		
			//读取XML文件,获得document对象.
			SAXReader reader = new SAXReader();
			org.dom4j.Document document = reader.read(new File("src/config.xml"));
			
			//获取文档的根节点
			Element root = document.getRootElement();
			//这个是取得根节点下的className字节点的文字.
			String cName = root.elementText("className");
			
			//通过类名生成实例对象并将其返回
			Class c = Class.forName(cName);
			Object obj =  c.newInstance();
			return obj;
		
		} catch(Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}
}
