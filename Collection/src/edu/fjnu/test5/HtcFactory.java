/**
 * 
 */
package edu.fjnu.test5;

/**
 * @author guoyumei
 *
 */
public class HtcFactory implements AbstractFactory {

	/* (non-Javadoc)
	 * @see edu.fjnu.test5.AbstractFactory#createPurchaseFactory()
	 */
	@Override
	public PurchaseCollection createPurchaseFactory() {
		System.out.println("生产HTC公司的采购单据");
		return new HtcPurchaseCollection();
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test5.AbstractFactory#createStorageFactory()
	 */
	@Override
	public StorageCollection createStorageFactory() {
		System.out.println("生产HTC司的库存单据");
		return new HtcStorageCollection();
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test5.AbstractFactory#createSaleFactory()
	 */
	@Override
	public SaleCollection createSaleFactory() {
		System.out.println("生产HTC公司的销售单据");
		return new HtcSaleCollection();
	}

}
