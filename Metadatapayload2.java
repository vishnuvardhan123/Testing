package dmr_testing;

import java.util.List;

public class Metadatapayload2 {
	
	private InputMetaData1 inputMetaData;
	
	private String trackingId;
	
	private MemberInfo1 memberInfo;
	
	private Mrainfo1 mraInfo;
	
	private List<PrescriptionsInfo1> prescriptionsInfo1;
	
	private String claimType;
	
	private String submissionDate;
	
	private String submissionTime;
	
	private String submissionType;
	
	private List<String> requestReasons;

	


public InputMetaData1 getInputMetaData() {
		return inputMetaData;
	}

	public void setInputMetaData(InputMetaData1 inputMetaData) {
		this.inputMetaData = inputMetaData;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public MemberInfo1 getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo1 memberInfo) {
		this.memberInfo = memberInfo;
	}

	public Mrainfo1 getMraInfo() {
		return mraInfo;
	}

	public void setMraInfo(Mrainfo1 mraInfo) {
		this.mraInfo = mraInfo;
	}

	public List<PrescriptionsInfo1> getPrescriptionsInfo1() {
		return prescriptionsInfo1;
	}

	public void setPrescriptionsInfo1(List<PrescriptionsInfo1> prescriptionsInfo1) {
		this.prescriptionsInfo1 = prescriptionsInfo1;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getSubmissionTime() {
		return submissionTime;
	}

	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}

	public String getSubmissionType() {
		return submissionType;
	}

	public void setSubmissionType(String submissionType) {
		this.submissionType = submissionType;
	}

	public List<String> getRequestReasons() {
		return requestReasons;
	}

	public void setRequestReasons(List<String> requestReasons) {
		this.requestReasons = requestReasons;
	}

class InputMetaData1 {
	
	 private String consumerAppId;
	 private String externalCorrelationId;
	 private String consumerType;
	 private String consumerAppType;
	
	 
	 public String getConsumerAppId() {
		return consumerAppId;
	}
	public void setConsumerAppId(String consumerAppId) {
		this.consumerAppId = consumerAppId;
	}
	public String getExternalCorrelationId() {
		return externalCorrelationId;
	}
	public void setExternalCorrelationId(String externalCorrelationId) {
		this.externalCorrelationId = externalCorrelationId;
	}
	public String getConsumerType() {
		return consumerType;
	}
	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}
	public String getConsumerAppType() {
		return consumerAppType;
	}
	public void setConsumerAppType(String consumerAppType) {
		this.consumerAppType = consumerAppType;
	}
	
}

class MemberInfo1 {
	
	private String carrierId;
	private String accountId;
	private String groupId;
	private String genderCode;
	private String instanceId;
	private String patientFirstName;
	private String patientLastName;
	private String patientInsuranceId;
	private String patientBirthDay;
	private String personCode;
	private String familyId;
	private String relationshipCode;
	private String policyHolderMemberID;
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGenderCode() {
		return genderCode;
	}
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getPatientInsuranceId() {
		return patientInsuranceId;
	}
	public void setPatientInsuranceId(String patientInsuranceId) {
		this.patientInsuranceId = patientInsuranceId;
	}
	public String getPatientBirthDay() {
		return patientBirthDay;
	}
	public void setPatientBirthDay(String patientBirthDay) {
		this.patientBirthDay = patientBirthDay;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public String getFamilyId() {
		return familyId;
	}
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}
	public String getRelationshipCode() {
		return relationshipCode;
	}
	public void setRelationshipCode(String relationshipCode) {
		this.relationshipCode = relationshipCode;
	}
	public String getPolicyHolderMemberID() {
		return policyHolderMemberID;
	}
	public void setPolicyHolderMemberID(String policyHolderMemberID) {
		this.policyHolderMemberID = policyHolderMemberID;
	}

}


class Mrainfo1 {
	
	private String mraFirstName;
	private String mraLastName;
	private String mraMiddleName;
	private String mraAddress1;
	private String mraAddress2;
	private String mraAddress3;
	private String mraCity;
	private String mraState;
	private String mraCountry;
	private String mraZipcode;
	private String mraManualAddrOvrInd;
	private String mraEmailId;
	private String mraPhoneNo;
	public String getMraFirstName() {
		return mraFirstName;
	}
	public void setMraFirstName(String mraFirstName) {
		this.mraFirstName = mraFirstName;
	}
	public String getMraLastName() {
		return mraLastName;
	}
	public void setMraLastName(String mraLastName) {
		this.mraLastName = mraLastName;
	}
	public String getMraMiddleName() {
		return mraMiddleName;
	}
	public void setMraMiddleName(String mraMiddleName) {
		this.mraMiddleName = mraMiddleName;
	}
	public String getMraAddress1() {
		return mraAddress1;
	}
	public void setMraAddress1(String mraAddress1) {
		this.mraAddress1 = mraAddress1;
	}
	public String getMraAddress2() {
		return mraAddress2;
	}
	public void setMraAddress2(String mraAddress2) {
		this.mraAddress2 = mraAddress2;
	}
	public String getMraAddress3() {
		return mraAddress3;
	}
	public void setMraAddress3(String mraAddress3) {
		this.mraAddress3 = mraAddress3;
	}
	public String getMraCity() {
		return mraCity;
	}
	public void setMraCity(String mraCity) {
		this.mraCity = mraCity;
	}
	public String getMraState() {
		return mraState;
	}
	public void setMraState(String mraState) {
		this.mraState = mraState;
	}
	public String getMraCountry() {
		return mraCountry;
	}
	public void setMraCountry(String mraCountry) {
		this.mraCountry = mraCountry;
	}
	public String getMraZipcode() {
		return mraZipcode;
	}
	public void setMraZipcode(String mraZipcode) {
		this.mraZipcode = mraZipcode;
	}
	public String getMraManualAddrOvrInd() {
		return mraManualAddrOvrInd;
	}
	public void setMraManualAddrOvrInd(String mraManualAddrOvrInd) {
		this.mraManualAddrOvrInd = mraManualAddrOvrInd;
	}
	public String getMraEmailId() {
		return mraEmailId;
	}
	public void setMraEmailId(String mraEmailId) {
		this.mraEmailId = mraEmailId;
	}
	public String getMraPhoneNo() {
		return mraPhoneNo;
	}
	public void setMraPhoneNo(String mraPhoneNo) {
		this.mraPhoneNo = mraPhoneNo;
	}
	
	

}

class PharmacyInfo1 {
	
	private String claimNPI;
	private String name;
	private String telephoneNumber;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	public String getClaimNPI() {
		return claimNPI;
	}
	public void setClaimNPI(String claimNPI) {
		this.claimNPI = claimNPI;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}

class PhysicianInfo1 {
	
	private String attendantNPI;
	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String addressLine1;
	private String city;
	private String state;
	private String zipCode;
	public String getAttendantNPI() {
		return attendantNPI;
	}
	public void setAttendantNPI(String attendantNPI) {
		this.attendantNPI = attendantNPI;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

class PrescriptionsInfo1 {
	
	private String drugName;
	private String drugStrength;
	private String dosageForm;
	private String quantity;
	private String daySupply;
	private String rxNumber;
	private String ndc;
	private String grossAmountDue;
	private String charges;
	private String submittedIngredientCost;
	private String serviceDate;
	private String dawCode;
	private PharmacyInfo1 pharmacyInfo;
	private PhysicianInfo1 physicianInfo;
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugStrength() {
		return drugStrength;
	}
	public void setDrugStrength(String drugStrength) {
		this.drugStrength = drugStrength;
	}
	public String getDosageForm() {
		return dosageForm;
	}
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDaySupply() {
		return daySupply;
	}
	public void setDaySupply(String daySupply) {
		this.daySupply = daySupply;
	}
	public String getRxNumber() {
		return rxNumber;
	}
	public void setRxNumber(String rxNumber) {
		this.rxNumber = rxNumber;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}
	public String getGrossAmountDue() {
		return grossAmountDue;
	}
	public void setGrossAmountDue(String grossAmountDue) {
		this.grossAmountDue = grossAmountDue;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getSubmittedIngredientCost() {
		return submittedIngredientCost;
	}
	public void setSubmittedIngredientCost(String submittedIngredientCost) {
		this.submittedIngredientCost = submittedIngredientCost;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getDawCode() {
		return dawCode;
	}
	public void setDawCode(String dawCode) {
		this.dawCode = dawCode;
	}
	public PharmacyInfo1 getPharmacyInfo() {
		return pharmacyInfo;
	}
	public void setPharmacyInfo(PharmacyInfo1 pharmacyInfo) {
		this.pharmacyInfo = pharmacyInfo;
	}
	public PhysicianInfo1 getPhysicianInfo() {
		return physicianInfo;
	}
	public void setPhysicianInfo(PhysicianInfo1 physicianInfo) {
		this.physicianInfo = physicianInfo;
	}
	
	
	
	
	
	
}

}

