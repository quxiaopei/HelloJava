
package com.day02;
/**
 * 封装：将数据（属性）和方法隐藏在类的内部，并对外提供统一的访问属性的方式
 * 完全封装：是一种规范。
 * 1.属性全部私有
 * 2.提供无参和全参构造
 */
public class Goods {
	private long goodsId;
	private String goodsName;
	private String goodsEnglishName;
	private String goodsThumb;
	private String goodsImg;
	private long addTime=1442419200000L;
	public Goods() {
	}
	public Goods(long goodsId, String goodsName, String goodsEnglishName, String goodsThumb, String goodsImg,
			long addTime) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsEnglishName = goodsEnglishName;
		this.goodsThumb = goodsThumb;
		this.goodsImg = goodsImg;
		this.addTime = addTime;
	}
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsEnglishName() {
		return goodsEnglishName;
	}
	public void setGoodsEnglishName(String goodsEnglishName) {
		this.goodsEnglishName = goodsEnglishName;
	}
	public String getGoodsThumb() {
		return goodsThumb;
	}
	public void setGoodsThumb(String goodsThumb) {
		this.goodsThumb = goodsThumb;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public long getAddTime() {
		return addTime;
	}
	public void setAddTime(long addTime) {
		this.addTime = addTime;
	}
}
