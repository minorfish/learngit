/**
 * 
 */
package edu.fjnu.test6.clone;

import java.io.Serializable;

/**
 * @author guoyumei
 *
 */
public class Data implements Serializable{
	private String data;

	public Data() {
		super();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Data(String data) {
		super();
		this.data = data;
	}
	public void display (){
		System.out.println(data);
	}
	
	public boolean equals(Data data){
		return this.data.equals(data.data);
	}

}
