package com.woori.domain;

public class RoomVO {
	int room_idx;
	String partnerId;
	String roomName;
	int roomNum;
	int price;
	String dogSize;
	int dogNum;
	int peopleNum;
	String img_room;
	String message_room;
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
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
	public int getDogNum() {
		return dogNum;
	}
	public void setDogNum(int dogNum) {
		this.dogNum = dogNum;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getImg_room() {
		return img_room;
	}
	public void setImg_room(String img_room) {
		this.img_room = img_room;
	}
	public String getMessage_room() {
		return message_room;
	}
	public void setMessage_room(String message_room) {
		this.message_room = message_room;
	}
	@Override
	public String toString() {
		return "RoomVO [room_idx=" + room_idx + ", partnerId=" + partnerId + ", roomName=" + roomName + ", roomNum="
				+ roomNum + ", price=" + price + ", dogSize=" + dogSize + ", dogNum=" + dogNum + ", peopleNum="
				+ peopleNum + ", img_room=" + img_room + ", message_room=" + message_room + "]";
	}
	
	
}
