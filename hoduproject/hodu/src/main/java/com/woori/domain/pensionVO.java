package com.woori.domain;

public class pensionVO {
	
	int idx;
	String img;
	String region;
	String pensionName;
	int price;
	int score;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPensionName() {
		return pensionName;
	}
	public void setPensionName(String pensionName) {
		this.pensionName = pensionName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "pensionVO [idx=" + idx + ", img=" + img + ", region=" + region + ", pensionName=" + pensionName
				+ ", price=" + price + ", score=" + score + "]";
	}
	
	

}
