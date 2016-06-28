package com.qa.mobileapp.common;

import com.qa.mobileapp.common.GlobalConstants.GENDER;

public class PatientModal {

	 private String patientFirstName;
	 private String patientLastName;
	 private GENDER gender;
	 private String mobileNo;
	 private String email;
	 private String address;
	 private String pinCode;
	 
	 public String getPatientLastName() {
		return patientLastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public GENDER getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public static PatientModal getPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setPatientFirstName(patientModal.getPatientFirstName());
		patientModal.setPatientLastName(patientModal.getPatientLastName());
		patientModal.setEmail(patientModal.getEmail());
		//patientModal.setGender(patientModal.getGender());
		patientModal.setMobileNo(patientModal.getMobileNo());
		patientModal.setAddress(patientModal.getAddress());
		patientModal.setPinCode(patientModal.getPinCode());
		return patientModal;
	}
 
	 
	 
}
