package com.sliit.mtit.addproducts.addproductservice.dto;

public class ProductRequest {

	private String productName;
	private String manufactureName;
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the manufactureName
	 */
	public String getManufactureName() {
		return manufactureName;
	}
	/**
	 * @param manufactureName the manufactureName to set
	 */
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	/**
	 * @return the date
	 */
	
	@Override
	public String toString() {
		return "ProductResponce [productName=" + productName + ", manufactureName=" + manufactureName +  "]";
	}
	

}
