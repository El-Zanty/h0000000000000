package com.Arquitectura.Hexagonal.tasks.domain.models;

public class AdditonalTaskInfo {
	
	private final long userid;
	private final String userName;
	private final String userEmail;
	
	public AdditonalTaskInfo(Long userid, String userName, String userEmail) {
		this.userid = userid;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public long getUserid() {
		return userid;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	
	
	
	
	
}
