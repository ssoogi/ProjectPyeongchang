package com.pf.olympic.model.vo;

	//박준석 DeliveryVo 생성

public class DeliveryVo {
	
	private String deliveryId;
	private String reservationId;
	private String deliveryName;
	private String deliveryPhone;
	private String deliveryAddress;
	private String deliveryEmail;
	
	
	
	
	public DeliveryVo(String deliveryId, String reservationId, String deliveryName, String deliveryPhone,
			String deliveryAddress, String deliveryEmail) {
		this.deliveryId = deliveryId;
		this.reservationId = reservationId;
		this.deliveryName = deliveryName;
		this.deliveryPhone = deliveryPhone;
		this.deliveryAddress = deliveryAddress;
		this.deliveryEmail = deliveryEmail;
	}




	public String getDeliveryId() {
		return deliveryId;
	}




	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}




	public String getReservationId() {
		return reservationId;
	}




	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}




	public String getDeliveryName() {
		return deliveryName;
	}




	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}




	public String getDeliveryPhone() {
		return deliveryPhone;
	}




	public void setDeliveryPhone(String deliveryPhone) {
		this.deliveryPhone = deliveryPhone;
	}




	public String getDeliveryAddress() {
		return deliveryAddress;
	}




	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}




	public String getDeliveryEmail() {
		return deliveryEmail;
	}




	public void setDeliveryEmail(String deliveryEmail) {
		this.deliveryEmail = deliveryEmail;
	}




	public DeliveryVo() {
		
	}
}
