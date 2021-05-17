package com.sliit.mtit.returnproducts.returnproductservice.dto;

public class ReturnResponce {

	private String productID;
	private String productName;
	private String addproductID;
	private String quantity;
	private String price;
	
	
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the addproductID
	 */
	public String getAddproductID() {
		return addproductID;
	}
	/**
	 * @param addproductID the addproductID to set
	 */
	public void setAddproductID(String addproductID) {
		this.addproductID = addproductID;
	}
	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
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
	@Override
	public String toString() {
		return "ReturnResponce [productID=" + productID + ", productName=" + productName + ", addproductID="
				+ addproductID + ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	
}
