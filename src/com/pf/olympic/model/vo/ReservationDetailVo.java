package com.pf.olympic.model.vo;

//생성자 박준석 ReservationDetailVo

public class ReservationDetailVo {

	private String seatId;
	private String reservationId;
	private String reservationState;

	public ReservationDetailVo() {

	}

	public ReservationDetailVo(String seatId, String reservationId, String reservationState) {

		this.seatId = seatId;
		this.reservationId = reservationId;
		this.reservationState = reservationState;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationState() {
		return reservationState;
	}

	public void setReservationState(String reservationState) {
		this.reservationState = reservationState;
	}

}
