package com.sliit.mtit.returnproducts.returnproductservice.dto;

public class APCResponce {

	private String productID;
	private String message;
	private String addproductID;
	private String price;
	private String quantity;
	
	/**
	 * @return the addproductID
	 */

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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "APCResponce [productID=" + productID + ", message=" + message + ", addproductID=" + addproductID
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	

	
}
