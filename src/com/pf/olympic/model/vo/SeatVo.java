package com.pf.olympic.model.vo;

public class SeatVo {

	private String seatId;
	private String seatLocation;
	private String seatGrade;
	private int seatPrice;
	private String matchId;

	public SeatVo() {

	}

	public SeatVo(String seatId, String seatLocation, String seatGrade, int seatPrice, String matchId) {
		super();
		this.seatId = seatId;
		this.seatLocation = seatLocation;
		this.seatGrade = seatGrade;
		this.seatPrice = seatPrice;
		this.matchId = matchId;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatLocation() {
		return seatLocation;
	}

	public void setSeatLocation(String seatLocation) {
		this.seatLocation = seatLocation;
	}

	public String getSeatGrade() {
		return seatGrade;
	}

	public void setSeatGrade(String seatGrade) {
		this.seatGrade = seatGrade;
	}

	public int getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	@Override
	public String toString() {
		return "SeatVo [좌석ID=" + seatId + ", 좌석위치=" + seatLocation + ", 좌석등급=" + seatGrade + ", 좌석가격=" + seatPrice
				+ ", 경기Id=" + matchId + "]";
	}
}
