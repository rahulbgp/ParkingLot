package com.parkinglot.models;

import java.util.Date;

public class BaseModel {
	private Long id;
	private Date createdAt;
	private Date upatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpatedAt() {
		return upatedAt;
	}
	public void setUpatedAt(Date upatedAt) {
		this.upatedAt = upatedAt;
	}

}
