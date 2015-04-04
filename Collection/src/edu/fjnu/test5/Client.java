/**
 * 
 */
package edu.fjnu.test5;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PurchaseCollection purchase;
		SaleCollection sale;
		StorageCollection storage;
		AbstractFactory factory = (AbstractFactory)XMLUtil.getBean();
		
		purchase = factory.createPurchaseFactory();
		sale = factory.createSaleFactory();
		storage = factory.createStorageFactory();
		
		purchase.handlePurchaseCollection();
		sale.handleSaleCollection();
		storage.handleStorageCollection();
	}

}
