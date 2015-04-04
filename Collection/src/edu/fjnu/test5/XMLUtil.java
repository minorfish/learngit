/**
 * 
 */
package edu.fjnu.test5;

import java.io.File;

import org.dom4j.io.SAXReader;


//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Element;   
//import org.dom4j.io.SAXReader;

//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;


/**
 * @author guoyumei
 *
 */
public class XMLUtil {
	
	public static Object getBean(){
		
		try{
			//创建DOM文档对象
			/*
			//得到创建 DOM 解析器的工厂 
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			//创建解析器对象
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			//解析XML文档，得到代表整个文档的Document对象
			Document document = builder.parse(new File("/home/guoyumei/design mode/log/src/designMode/test4/log/config.xml"));
			
			//获取包含类名的文本节点
			NodeList n1 = document.getElementsByTagName("className");
			Node classNode = n1.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			*/
		
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
