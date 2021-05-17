package com.sliit.mtit.returnproducts.returnproductservice.dto;

public class APCRequset {

	private String productName;
	private String manufactureName;
	private String date;
	private String price;
	private String quantity;
	
	
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
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
	@Override
	public String toString() {
		return "ProductRequest [productName=" + productName + ", manufactureName=" + manufactureName + ", date=" + date
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	public String calc(double x, double y) {
		
		 x = Double.parseDouble(getPrice());
		 y = Double.parseDouble(getQuantity());
		 double z = x* y;
		 
		return String.valueOf(z);
		
		
	}

}
