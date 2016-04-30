package com.sanhao.tech.teacherfeed.model;

import java.math.BigDecimal;

/**
 * 用户�?
 * @author sanhao
 *
 */
public class User {
	private int user_id;
	private long user_account;
	private int user_salt;
	private BigDecimal user_balance;
	private int user_level;
	private int user_recommend;
	private int user_type;
	private int channel_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public long getUser_account() {
		return user_account;
	}
	public void setUser_account(long user_account) {
		this.user_account = user_account;
	}
	public int getUser_salt() {
		return user_salt;
	}
	public void setUser_salt(int user_salt) {
		this.user_salt = user_salt;
	}
	public BigDecimal getUser_balance() {
		return user_balance;
	}
	public void setUser_balance(BigDecimal user_balance) {
		this.user_balance = user_balance;
	}
	public int getUser_level() {
		return user_level;
	}
	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}
	public int getUser_recommend() {
		return user_recommend;
	}
	public void setUser_recommend(int user_recommend) {
		this.user_recommend = user_recommend;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_account=" + user_account + ", user_salt=" + user_salt
				+ ", user_balance=" + user_balance + ", user_level=" + user_level + ", user_recommend=" + user_recommend
				+ ", user_type=" + user_type + ", channel_id=" + channel_id + "]";
	}
	
	
}
