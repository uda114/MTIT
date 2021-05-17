package com.sliit.mtit.addproducts.addproductservice.dto;

public class ProductResponce {
	
	private String productID;
	private String message;
	
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
		return "ProductRequest [productID=" + productID + ", message=" + message + "]";
	}
	


}
