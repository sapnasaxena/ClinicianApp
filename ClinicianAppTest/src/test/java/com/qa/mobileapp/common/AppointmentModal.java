package com.qa.mobileapp.common;

public class AppointmentModal {

	 private String patientName;
	 private String appointmentDate;
	 private String serviceFees;
	 private String status;
	
	 
	 
	 public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getServiceFees() {
		return serviceFees;
	}
	public void setServiceFees(String serviceFees) {
		this.serviceFees = serviceFees;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	
	 public static AppointmentModal getAppointmentDetails(){
			AppointmentModal appointmentModal = new AppointmentModal();
			appointmentModal.setPatientName(appointmentModal.getPatientName());
			appointmentModal.setAppointmentDate(appointmentModal.getAppointmentDate());
			appointmentModal.setStatus(appointmentModal.getStatus());
			appointmentModal.setServiceFees(appointmentModal.getServiceFees());
			return appointmentModal;
		}
	 
}
