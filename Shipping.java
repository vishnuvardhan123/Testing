package ddd_api;


public class Shipping {
	
	 
	 private String id;
	 private String shippingMethod;
	 private String prescriptionType;
	 private String confidenceLevel;
	 private String cleanStatus;
	 private String fillType;
	 private String estimatedDays;
	 private String azureUpdateDate;
	 private String Zipcode;
	 
	 /**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return Zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the shippingMethod
	 */
	public String getShippingMethod() {
		return shippingMethod;
	}
	/**
	 * @param shippingMethod the shippingMethod to set
	 */
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	/**
	 * @return the prescriptionType
	 */
	public String getPrescriptionType() {
		return prescriptionType;
	}
	/**
	 * @param prescriptionType the prescriptionType to set
	 */
	public void setPrescriptionType(String prescriptionType) {
		this.prescriptionType = prescriptionType;
	}
	/**
	 * @return the confidenceLevel
	 */
	public String getConfidenceLevel() {
		return confidenceLevel;
	}
	/**
	 * @param confidenceLevel the confidenceLevel to set
	 */
	public void setConfidenceLevel(String confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
	/**
	 * @return the cleanStatus
	 */
	public String getCleanStatus() {
		return cleanStatus;
	}
	/**
	 * @param cleanStatus the cleanStatus to set
	 */
	public void setCleanStatus(String cleanStatus) {
		this.cleanStatus = cleanStatus;
	}
	/**
	 * @return the fillType
	 */
	public String getFillType() {
		return fillType;
	}
	/**
	 * @param fillType the fillType to set
	 */
	public void setFillType(String fillType) {
		this.fillType = fillType;
	}
	/**
	 * @return the estimatedDays
	 */
	public String getEstimatedDays() {
		return estimatedDays;
	}
	/**
	 * @param estimatedDays the estimatedDays to set
	 */
	public void setEstimatedDays(String estimatedDays) {
		this.estimatedDays = estimatedDays;
	}
	/**
	 * @return the azureUpdateDate
	 */
	public String getAzureUpdateDate() {
		return azureUpdateDate;
	}
	/**
	 * @param azureUpdateDate the azureUpdateDate to set
	 */
	public void setAzureUpdateDate(String azureUpdateDate) {
		this.azureUpdateDate = azureUpdateDate;
	}
	
}

