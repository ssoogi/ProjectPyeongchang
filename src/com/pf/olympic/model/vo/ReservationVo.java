package com.pf.olympic.model.vo;

public class ReservationVo {

	private String reservationId;
	private String memberId;
	private String reservationDate;
	private int reservationMount;
	private int reservationTotal;
	private int payWay;
	private int deliveryWay;

	public ReservationVo() {

	}

	public ReservationVo(String reservationId, String memberId, String reservationDate, int reservationMount,
			int reservationTotal, int payWay, int deliveryWay) {
		super();
		this.reservationId = reservationId;
		this.memberId = memberId;
		this.reservationDate = reservationDate;
		this.reservationMount = reservationMount;
		this.reservationTotal = reservationTotal;
		this.payWay = payWay;
		this.deliveryWay = deliveryWay;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getReservationMount() {
		return reservationMount;
	}

	public void setReservationMount(int reservationMount) {
		this.reservationMount = reservationMount;
	}

	public int getReservationTotal() {
		return reservationTotal;
	}

	public void setReservationTotal(int reservationTotal) {
		this.reservationTotal = reservationTotal;
	}

	public int getPayWay() {
		return payWay;
	}

	public void setPayWay(int payWay) {
		this.payWay = payWay;
	}

	public int getDeliveryWay() {
		return deliveryWay;
	}

	public void setDeliveryWay(int deliveryWay) {
		this.deliveryWay = deliveryWay;
	}

	@Override
	public String toString() {
		return "ReservationVo [예약ID=" + reservationId + ", 회원ID=" + memberId + ", 예약일자=" + reservationDate + ",할인율 ="
				+ reservationMount + ", 총예매수=" + reservationTotal + ", 결제수단=" + payWay + ", 배송수단=" + deliveryWay + "]";
	}

}
