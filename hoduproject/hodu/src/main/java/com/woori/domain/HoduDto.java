package com.woori.domain;

import java.util.Date;

public class HoduDto {

	 String userId;
	 String userPw;
	 String userName;
	 Date userBirth;
	 int sex;
	 String userMobile;
	 String userEmail;
	 int idx;
	 
	 String partnerId;
	 String partnerPw;
	 String partnerName;
	 String businessNum;
	 String partnerMobile;
	 String partnerEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
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
		return "HoduDto [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userBirth="
				+ userBirth + ", sex=" + sex + ", userMobile=" + userMobile + ", userEmail=" + userEmail + ", idx="
				+ idx + ", partnerId=" + partnerId + ", partnerPw=" + partnerPw + ", partnerName=" + partnerName
				+ ", businessNum=" + businessNum + ", partnerMobile=" + partnerMobile + ", partnerEmail=" + partnerEmail
				+ "]";
	}
	
}
