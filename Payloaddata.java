package dmr_testing;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Payloaddata {
	
//	public Metadatapayload payload;
	
	public Metadatapayload data(Metadatapayload payload) {
		
		InputMetaData inputMetaData = new InputMetaData();
		inputMetaData.setConsumerAppId("DMR MemberPortal");
		inputMetaData.setConsumerType("MA");
		inputMetaData.setConsumerAppType("IA");
		inputMetaData.setExternalCorrelationId("MetaDataCo0231021_1");
		
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setCarrierId("Carr");
		memberInfo.setAccountId("ACC");
		memberInfo.setGroupId("GRP");
		memberInfo.setGenderCode("M");
		memberInfo.setInstanceId("BK1");
		memberInfo.setPatientFirstName("SPIDER");
		memberInfo.setPatientLastName("MAN");
		memberInfo.setPatientInsuranceId("155454532");
		memberInfo.setPatientBirthDay("09/23/2022");
		memberInfo.setPersonCode("AAD");
		memberInfo.setFamilyId("1234567");
		memberInfo.setRelationshipCode("1");
		memberInfo.setPolicyHolderMemberID("12345678987");
		
		Mrainfo mrainfo = new Mrainfo();
		mrainfo.setMraFirstName("WALKER");
		mrainfo.setMraLastName("CANEDY");
		mrainfo.setMraMiddleName("ALAN");
		mrainfo.setMraAddress1("Address1");
		mrainfo.setMraAddress2("Address2");
		mrainfo.setMraAddress3("Address3");
		mrainfo.setMraCity("NY");
		mrainfo.setMraState("AB");
		mrainfo.setMraCountry("ABCD");
		mrainfo.setMraZipcode("12345");
		mrainfo.setMraManualAddrOvrInd("Y");
		mrainfo.setMraEmailId("abc123@abc.xyz");
		mrainfo.setMraPhoneNo("123-456-7890");
		
		PharmacyInfo pharmacyInfo = new PharmacyInfo();
		pharmacyInfo.setClaimNPI("323213231");
		pharmacyInfo.setName("Dispensing Pharmacy Name");
		pharmacyInfo.setTelephoneNumber("123-456-7890");
		pharmacyInfo.setAddress1("Address 1");
		pharmacyInfo.setAddress2("Address 2");
		pharmacyInfo.setCity("CA");
		pharmacyInfo.setState("CA");
		pharmacyInfo.setZipCode("12345");
		
		PhysicianInfo physicianInfo = new PhysicianInfo();
		physicianInfo.setAttendantNPI("123456789012345");
		physicianInfo.setFirstName("First Name");
		physicianInfo.setLastName("Last Name");
		physicianInfo.setTelephoneNumber("123-456-7890");
		physicianInfo.setAddressLine1("Address Line 1");
		physicianInfo.setCity("CA");
		physicianInfo.setState("CA");
		physicianInfo.setZipCode("12345");
		
		PrescriptionsInfo prescriptionsInfo = new PrescriptionsInfo();
		prescriptionsInfo.setDrugName("Drug name");
		prescriptionsInfo.setDrugStrength("Drug strength data");
		prescriptionsInfo.setDosageForm("Dosage form data");
		prescriptionsInfo.setQuantity("14.00");
		prescriptionsInfo.setDaySupply("7");
		prescriptionsInfo.setRxNumber("1215097");
		prescriptionsInfo.setNdc("16714047801");
		prescriptionsInfo.setGrossAmountDue("11.05");
		prescriptionsInfo.setCharges("11.05");
		prescriptionsInfo.setSubmittedIngredientCost("25");
		prescriptionsInfo.setServiceDate("04/24/2023");
		prescriptionsInfo.setDawCode("1");
		prescriptionsInfo.setPharmacyInfo(pharmacyInfo);
		prescriptionsInfo.setPhysicianInfo(physicianInfo);
		ArrayList<PrescriptionsInfo> list = new ArrayList<PrescriptionsInfo>();
		list.add(prescriptionsInfo);
		
		payload = new Metadatapayload();
		payload.setInputMetaData(inputMetaData);
//		payload.setTrackingId("");
		payload.setMemberInfo(memberInfo);
		payload.setMraInfo(mrainfo);
		payload.setPrescriptionsInfo(list);
		payload.setClaimType("DMR");
		payload.setSubmissionDate("2023-10-30");
		payload.setSubmissionTime("18:28:42");
		payload.setSubmissionType("submitForSelf");
		ArrayList<String> requestReasons = new ArrayList<String>();
		requestReasons.add("I did not use my Member ID card I was waiting for drug approval");
		payload.setRequestReasons(requestReasons);
		
//		ObjectMapper object = new ObjectMapper();
//		String payload_data = object.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
//		System.out.println(payload_data);
		
		return payload;
	}

}
