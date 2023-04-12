package com.woori.domain;

public class ReservationVO {
	String userId;
	String userName;
	String userMobile;
	String userEmail;
	String pensionName;
	int price;
	String dogSize;
	int dogNumber;
	int peopleNum;
	String message_to_p;
	String reservation_date;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getDogSize() {
		return dogSize;
	}
	public void setDogSize(String dogSize) {
		this.dogSize = dogSize;
	}
	public int getDogNumber() {
		return dogNumber;
	}
	public void setDogNumber(int dogNumber) {
		this.dogNumber = dogNumber;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getMessage_to_p() {
		return message_to_p;
	}
	public void setMessage_to_p(String message_to_p) {
		this.message_to_p = message_to_p;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}
	@Override
	public String toString() {
		return "ReservationVO [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile
				+ ", userEmail=" + userEmail + ", pensionName=" + pensionName + ", price=" + price + ", dogSize="
				+ dogSize + ", dogNumber=" + dogNumber + ", peopleNum=" + peopleNum + ", message_to_p=" + message_to_p
				+ ", reservation_date=" + reservation_date + "]";
	}
}
