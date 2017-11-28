package com.pf.olympic.model.vo;

public class StadiumVo {
	
	private String stadiumId;
    private String stadiumCategory;
    private String stadiumName;
    private String stadiumLocation;
    private String stadiumWay;
    private String stadiumInout;
   
	public StadiumVo() {
		
	}

	public StadiumVo(String stadiumId, String stadiumCategory, String stadiumName, String stadiumLocation,
			String stadiumWay, String stadiumInout) {
		super();
		this.stadiumId = stadiumId;
		this.stadiumCategory = stadiumCategory;
		this.stadiumName = stadiumName;
		this.stadiumLocation = stadiumLocation;
		this.stadiumWay = stadiumWay;
		this.stadiumInout = stadiumInout;
	}


	public String getStadiumId() {
		return stadiumId;
	}


	public void setStadiumId(String stadiumId) {
		this.stadiumId = stadiumId;
	}


	public String getStadiumCategory() {
		return stadiumCategory;
	}


	public void setStadiumCategory(String stadiumCategory) {
		this.stadiumCategory = stadiumCategory;
	}


	public String getStadiumName() {
		return stadiumName;
	}


	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}


	public String getStadiumLocation() {
		return stadiumLocation;
	}


	public void setStadiumLocation(String stadiumLocation) {
		this.stadiumLocation = stadiumLocation;
	}


	public String getStadiumWay() {
		return stadiumWay;
	}


	public void setStadiumWay(String stadiumWay) {
		this.stadiumWay = stadiumWay;
	}


	public String getStadiumInout() {
		return stadiumInout;
	}


	public void setStadiumInout(String stadiumInout) {
		this.stadiumInout = stadiumInout;
	}


	@Override
	public String toString() {
		return "StadiumVo [경기장=" + stadiumId + ", 경기장 구분=" + stadiumCategory + ", 경기장 이름="
				+ stadiumName + ", 경기장 위치=" + stadiumLocation + ", 경기장 오는길=" + stadiumWay
				+ ", 경기장 실내외=" + stadiumInout + "]";
	}
}

