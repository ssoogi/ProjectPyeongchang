package com.pf.olympic.model.vo;

public class RefundVo {

	private String refundId;
	private String seatId;
	private String reservationId;
	private String refundRequestday;
	private int refundMount;
	private String refundResult;

	public RefundVo() {

	}

	public RefundVo(String refundId, String seatId, String reservationId, String refundRequestday, int refundMount,
			String refundResult) {
		this.refundId = refundId;
		this.seatId = seatId;
		this.reservationId = reservationId;
		this.refundRequestday = refundRequestday;
		this.refundMount = refundMount;
		this.refundResult = refundResult;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
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

	public String getRefundRequestday() {
		return refundRequestday;
	}

	public void setRefundRequestday(String refundRequestday) {
		this.refundRequestday = refundRequestday;
	}

	public int getRefundMount() {
		return refundMount;
	}

	public void setRefundMount(int refundMount) {
		this.refundMount = refundMount;
	}

	public String getRefundResult() {
		return refundResult;
	}

	public void setRefundResult(String refundResult) {
		this.refundResult = refundResult;
	}

}
