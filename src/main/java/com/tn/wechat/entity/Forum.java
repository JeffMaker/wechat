package com.tn.wechat.entity;

public class Forum {
	private String openid;
	private String userName;
	private String topic;
	private String detail;
	private String reply;
	/**
	 * Getter & Setter
	 */
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * override toString
	 */
	@Override
	public String toString() {
		return "Forum [openid=" + openid + ", userName=" + userName + ", topic=" + topic + ", detail=" + detail
				+ ", reply=" + reply + "]";
	}
	
}
