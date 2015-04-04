/**
 * 
 */
package edu.fjnu.test6.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * @author guoyumei
 *
 */
public class Chart implements Serializable {
	
	private Integer id;
	private String color;
	private Data data = null;
	
	public Chart(Integer id, String color, Data data) {
		super();
		this.id = id;
		this.color = color;
		this.data = data;
	}
	
	public Chart() {
		super();
		this.data = new Data();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException,OptionalDataException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (ois.readObject());
	}
	
	public void dispaly(){
		System.out.println("图表的编号："+this.id);
		System.out.println("图表的颜色："+this.color);
		this.data.display();
	}
}
