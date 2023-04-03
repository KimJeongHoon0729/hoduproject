package com.woori.domain;

public class PartnerVO {

	 String partnerId;
	 String partnerPw;
	 String partnerName;
	 String businessNum;
	 String partnerMobile;
	 String partnerEmail;
	 String img;
	 
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerPw() {
		return partnerPw;
	}
	public void setPartnerPw(String partnerPw) {
		this.partnerPw = partnerPw;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getBusinessNum() {
		return businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}
	public String getPartnerMobile() {
		return partnerMobile;
	}
	public void setPartnerMobile(String partnerMobile) {
		this.partnerMobile = partnerMobile;
	}
	public String getPartnerEmail() {
		return partnerEmail;
	}
	public void setPartnerEmail(String partnerEmail) {
		this.partnerEmail = partnerEmail;
	}
	@Override
	public String toString() {
		return "partnerVO [partnerId=" + partnerId + ", partnerPw=" + partnerPw + ", partnerName=" + partnerName
				+ ", businessNum=" + businessNum + ", partnerMobile=" + partnerMobile + ", partnerEmail=" + partnerEmail
				+ "]";
	}



	 
}
