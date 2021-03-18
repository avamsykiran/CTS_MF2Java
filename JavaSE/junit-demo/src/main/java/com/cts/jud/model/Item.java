package com.cts.jud.model;

public class Item {

	private int bcode;
	private String title;
	private double basePrice;
	private double sellingPrice;
	private double maxRetailPrice;
	
	public Item() {
		
	}

	public Item(int bcode, String title, double basePrice) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.basePrice = basePrice;
	}
		
	public Item(int bcode, String title, double basePrice, double sellingPrice, double maxRetailPrice) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.basePrice = basePrice;
		this.sellingPrice = sellingPrice;
		this.maxRetailPrice = maxRetailPrice;
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getMaxRetailPrice() {
		return maxRetailPrice;
	}

	public void setMaxRetailPrice(double maxRetailPrice) {
		this.maxRetailPrice = maxRetailPrice;
	}

	@Override
	public String toString() {
		return "Item [bcode=" + bcode + ", title=" + title + ", basePrice=" + basePrice + ", sellingPrice="
				+ sellingPrice + ", maxRetailPrice=" + maxRetailPrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + bcode;
		temp = Double.doubleToLongBits(maxRetailPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Double.doubleToLongBits(basePrice) != Double.doubleToLongBits(other.basePrice))
			return false;
		if (bcode != other.bcode)
			return false;
		if (Double.doubleToLongBits(maxRetailPrice) != Double.doubleToLongBits(other.maxRetailPrice))
			return false;
		if (Double.doubleToLongBits(sellingPrice) != Double.doubleToLongBits(other.sellingPrice))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
