package com.woori.domain;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class QuestionVO {

	
	String userId;
	String pensionName;
	String partnerId;
	String Q_title;
	String Q_content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date Q_date;
	String Q_pw;
	int Q_idx;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPensionName() {
		return pensionName;
	}
	public void setPensionName(String pensionName) {
		this.pensionName = pensionName;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getQ_title() {
		return Q_title;
	}
	public void setQ_title(String q_title) {
		Q_title = q_title;
	}
	public String getQ_content() {
		return Q_content;
	}
	public void setQ_content(String q_content) {
		Q_content = q_content;
	}
	public Date getQ_date() {
		return Q_date;
	}
	public void setQ_date(Date q_date) {
		Q_date = q_date;
	}
	public String getQ_pw() {
		return Q_pw;
	}
	public void setQ_pw(String q_pw) {
		Q_pw = q_pw;
	}
	public int getQ_idx() {
		return Q_idx;
	}
	public void setQ_idx(int q_idx) {
		Q_idx = q_idx;
	}
	@Override
	public String toString() {
		return "QuestionVO [userId=" + userId + ", pensionName=" + pensionName + ", partnerId=" + partnerId
				+ ", Q_title=" + Q_title + ", Q_content=" + Q_content + ", Q_date=" + Q_date + ", Q_pw=" + Q_pw
				+ ", Q_idx=" + Q_idx + "]";
	}
	
	
	
}