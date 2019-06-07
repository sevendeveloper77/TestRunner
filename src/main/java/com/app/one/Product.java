package com.app.one;

public class Product {
	
	private int prdId;

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + "]";
	}
	
}
