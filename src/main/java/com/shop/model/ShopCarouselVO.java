package com.shop.model;

import java.io.Serializable;

import com.mysql.cj.jdbc.Blob;

public class ShopCarouselVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer shopCarouselId;
	private Integer shopCarouselPosition;
	private Integer prodTypeId;
	private Blob shopCarouselPic;
	private String shopCarouselUrl;

	public Integer getShopCarouselId() {
		return shopCarouselId;
	}

	public void setShopCarouselId(Integer shopCarouselId) {
		this.shopCarouselId = shopCarouselId;
	}

	public Integer getShopCarouselPosition() {
		return shopCarouselPosition;
	}

	public void setShopCarouselPosition(Integer shopCarouselPosition) {
		this.shopCarouselPosition = shopCarouselPosition;
	}

	public Integer getProdTypeId() {
		return prodTypeId;
	}

	public void setProdTypeId(Integer prodTypeId) {
		this.prodTypeId = prodTypeId;
	}

	public Blob getShopCarouselPic() {
		return shopCarouselPic;
	}

	public void setShopCarouselPic(Blob shopCarouselPic) {
		this.shopCarouselPic = shopCarouselPic;
	}

	public String getShopCarouselUrl() {
		return shopCarouselUrl;
	}

	public void setShopCarouselUrl(String shopCarouselUrl) {
		this.shopCarouselUrl = shopCarouselUrl;
	}

}
