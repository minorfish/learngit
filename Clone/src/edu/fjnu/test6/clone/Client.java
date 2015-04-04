/**
 * 
 */
package edu.fjnu.test6.clone;

import java.io.IOException;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		
		Data d1 = new Data("这是一张关于收益的图标");
		Data d2 = new Data("这是一张关于亏损的图标");
		Chart c1 = new Chart(1, "red", d1);
		c1.dispaly();
		Chart c2 = (Chart) c1.deepClone();
		
		System.out.println("c1 == c2?");
		System.out.println(c1==c2);
		System.out.println("c1里面的数据集== c2里面的数据集?");
		System.out.println(c1.getData()==c2.getData());
		System.out.println("c1里面的数据内容== c2里面的数据内容?");
		System.out.println(c1.getData().equals(c2.getData()));
		
		c2.setId(2);
		c2.setColor("gray");
		c2.setData(d2);
		c2.dispaly();
	}

}
