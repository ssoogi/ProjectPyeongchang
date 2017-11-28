package com.pf.olympic.model.vo;

//박준석 MemberVo 
public class MemberVo {

	private String memberId;
	private String memberName;
	private int memberCategory;
	private String memberLoginId;
	private String memberLoginPwd;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private int memberDiscount;

	public MemberVo() {

	}

	public MemberVo(String memberId, String memberName, int memberCategory, String memberLoginId, String memberLoginPwd,
			String memberEmail, String memberPhone, String memberAddress, int memberDiscount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberCategory = memberCategory;
		this.memberLoginId = memberLoginId;
		this.memberLoginPwd = memberLoginPwd;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberDiscount = memberDiscount;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberCategory() {
		return memberCategory;
	}

	public void setMemberCategory(int memberCategory) {
		this.memberCategory = memberCategory;
	}

	public String getMemberLoginId() {
		return memberLoginId;
	}

	public void setMemberLoginId(String memberLoginId) {
		this.memberLoginId = memberLoginId;
	}

	public String getMemberLoginPwd() {
		return memberLoginPwd;
	}

	public void setMemberLoginPwd(String memberLoginPwd) {
		this.memberLoginPwd = memberLoginPwd;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public int getMemberDiscount() {
		return memberDiscount;
	}

	public void setMemberDiscount(int memberDiscount) {
		this.memberDiscount = memberDiscount;
	}

}
