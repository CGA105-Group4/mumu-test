package com.shop.model;

import java.io.Serializable;

public class OrderListVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer OrderId;
	private Integer ProdOptId;
	private Integer ProdOptQuantity;
	private Integer OrderExtendedListPrice;

	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}

	public Integer getProdOptId() {
		return ProdOptId;
	}

	public void setProdOptId(Integer prodOptId) {
		ProdOptId = prodOptId;
	}

	public Integer getProdOptQuantity() {
		return ProdOptQuantity;
	}

	public void setProdOptQuantity(Integer prodOptQuantity) {
		ProdOptQuantity = prodOptQuantity;
	}

	public Integer getOrderExtendedListPrice() {
		return OrderExtendedListPrice;
	}

	public void setOrderExtendedListPrice(Integer orderExtendedListPrice) {
		OrderExtendedListPrice = orderExtendedListPrice;
	}

}
