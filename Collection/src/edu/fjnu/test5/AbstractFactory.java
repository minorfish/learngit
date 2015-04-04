/**
 * 
 */
package edu.fjnu.test5;

/**
 * @author guoyumei
 *
 */
public interface AbstractFactory {
	
		PurchaseCollection createPurchaseFactory();
		StorageCollection createStorageFactory();
		SaleCollection createSaleFactory();		
}
