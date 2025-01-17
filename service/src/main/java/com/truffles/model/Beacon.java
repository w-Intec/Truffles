package com.truffles.model;

import java.io.Serializable;

public class Beacon implements Serializable{

	private static final long serialVersionUID = -820345688369025369L;
	
	private int id;
	private String name;
	private String latitude;
	private String longitude;
	private String UUID;
	private String content;
	private int radius;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
