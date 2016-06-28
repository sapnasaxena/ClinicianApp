package com.qa.mobileapp.common;

import com.qa.mobileapp.common.GlobalConstants.SUBSERVICE;

public class SubServiceModal {
	
	private String subServiceName;
	private String subServicePrice;
	
	public String getSubServiceName(SUBSERVICE subserviceName) {
		return subServiceName;
	}
	public void setSubServiceName(String subServiceName) {
		this.subServiceName = subServiceName;
	}
	public String getSubServicePrice() {
		return subServicePrice;
	}
	public void setSubServicePrice(String subServicePrice) {
		this.subServicePrice = subServicePrice;
	}
	
	 public static SubServiceModal getSubServiceDetails(){
			SubServiceModal subserviceModal = new SubServiceModal();
			subserviceModal.setSubServiceName(subserviceModal.getSubServiceName(SUBSERVICE.ADL_Training));
			subserviceModal.setSubServicePrice(subserviceModal.getSubServicePrice());
			return subserviceModal;
		}
	

}
