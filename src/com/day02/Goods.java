
package com.day02;
/**
 * ��װ�������ݣ����ԣ��ͷ�������������ڲ����������ṩͳһ�ķ������Եķ�ʽ
 * ��ȫ��װ����һ�ֹ淶��
 * 1.����ȫ��˽��
 * 2.�ṩ�޲κ�ȫ�ι���
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
