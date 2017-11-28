package com.pf.olympic.model.vo;

public class MatchVo {
	private String matchId;
	private String matchCategory;
	private String matchName;
	private String matchDate;
	private String matchStartTime;
	private String matchEndTime;
	private String matchTime;
	private String matchGender;
	private String matchMedal;
	private String matchCancelDate;
	private String stadiumId;

	public MatchVo() {
		
	}

	public MatchVo(String matchId, String matchCategory, String matchName, String matchDate, String matchStartTime,
			String matchEndTime, String matchTime, String matchGender, String matchMedal, String matchCancelDate,
			String stadiumId) {
		super();
		this.matchId = matchId;
		this.matchCategory = matchCategory;
		this.matchName = matchName;
		this.matchDate = matchDate;
		this.matchStartTime = matchStartTime;
		this.matchEndTime = matchEndTime;
		this.matchTime = matchTime;
		this.matchGender = matchGender;
		this.matchMedal = matchMedal;
		this.matchCancelDate = matchCancelDate;
		this.stadiumId = stadiumId;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public String getMatchCategory() {
		return matchCategory;
	}

	public void setMatchCategory(String matchCategory) {
		this.matchCategory = matchCategory;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getMatchStartTime() {
		return matchStartTime;
	}

	public void setMatchStartTime(String matchStartTime) {
		this.matchStartTime = matchStartTime;
	}

	public String getMatchEndTime() {
		return matchEndTime;
	}

	public void setMatchEndTime(String matchEndTime) {
		this.matchEndTime = matchEndTime;
	}

	public String getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	public String getMatchGender() {
		return matchGender;
	}

	public void setMatchGender(String matchGender) {
		this.matchGender = matchGender;
	}

	public String getMatchMedal() {
		return matchMedal;
	}

	public void setMatchMedal(String matchMedal) {
		this.matchMedal = matchMedal;
	}

	public String getMatchCancelDate() {
		return matchCancelDate;
	}

	public void setMatchCancelDate(String matchCancelDate) {
		this.matchCancelDate = matchCancelDate;
	}

	public String getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(String stadiumId) {
		this.stadiumId = stadiumId;
	}

}
