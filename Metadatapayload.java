package dmr_testing;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Metadatapayload {
	
	private InputMetaData inputMetaData;
	
	private String trackingId;
	
	private MemberInfo memberInfo;
	
	private Mrainfo mraInfo;
	
	private List<PrescriptionsInfo> prescriptionsInfo;
	
	private String claimType;
	
	private String submissionDate;
	
	private String submissionTime;
	private String submissionType;
	
	private List<String> requestReasons;

	public InputMetaData getInputMetaData() {
		return inputMetaData;
	}

	public void setInputMetaData(InputMetaData inputMetaData) {
		this.inputMetaData = inputMetaData;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	public Mrainfo getMraInfo() {
		return mraInfo;
	}

	public void setMraInfo(Mrainfo mraInfo) {
		this.mraInfo = mraInfo;
	}

	public List<PrescriptionsInfo> getPrescriptionsInfo() {
		return prescriptionsInfo;
	}

	public void setPrescriptionsInfo(List<PrescriptionsInfo> prescriptionsInfo) {
		this.prescriptionsInfo = prescriptionsInfo;
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
	
	

}


