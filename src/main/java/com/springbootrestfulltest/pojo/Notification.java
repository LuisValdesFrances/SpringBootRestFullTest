package com.springbootrestfulltest.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Notification")
public class Notification {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int preSceneId;
	
	private String userFrom;
	
	private String userTo;
	
	private int message;
	
	private Date creationDate;
	
	private int type;
	
	
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPreSceneId() {
		return preSceneId;
	}


	public void setPreSceneId(int preSceneId) {
		this.preSceneId = preSceneId;
	}


	public String getUserFrom() {
		return userFrom;
	}


	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}


	public String getUserTo() {
		return userTo;
	}


	public void setUserTo(String userTo) {
		this.userTo = userTo;
	}


	public int getMessage() {
		return message;
	}


	public void setMessage(int message) {
		this.message = message;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}

}
