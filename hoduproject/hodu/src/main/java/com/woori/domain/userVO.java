package com.woori.domain;

import java.util.Date;

public class userVO {

	 String userId;
	 String userPw;
	 String userName;
	 Date userBirth;
	 int sex;
	 String userMobile;
	 String userEmail;
	 int idx;
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
	@Override
	public String toString() {
		return "userVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userBirth=" + userBirth
				+ ", sex=" + sex + ", userMobile=" + userMobile + ", userEmail=" + userEmail + ", idx=" + idx + "]";
	}
	
	
}
