/**
 * 
 */
package edu.fjnu.test7.xmlutil;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author guoyumei
 *
 */
public class XMLUtil {
	
	public static Object getBean(String args){
		
		try{
			//创建DOM文档对象
			
			//得到创建 DOM 解析器的工厂 
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			//创建解析器对象
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			//解析XML文档，得到代表整个文档的Document对象
			Document document = builder.parse(new File("src/config.xml"));
			
			NodeList n1 = document.getElementsByTagName("className");
			String cName = null;
			Node classNode = null;
			
			//获取包含类名的文本节点
			if (args.equals("logger")) {
				classNode = n1.item(0).getFirstChild();
			} else if (args.equals("language")) {
				classNode = n1.item(1).getFirstChild();
			} else {
				classNode = n1.item(2).getFirstChild();
			}
			cName = classNode.getNodeValue();
			
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
