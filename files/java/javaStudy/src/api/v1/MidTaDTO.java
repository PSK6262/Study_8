package api.v1;

public class MidTaDTO {
	//api 요청이력 table로 분리 가능
    private String resultCode;
	private String resultMsg;
	
	private String tmFc;
	private String regId; 
	private int taMin4; // min temp after 4 days
	private int taMin5;
	private int taMax4;
	private int taMax5;
	
	public int getTaMax5() {
		return taMax5;
	}
	public void setTaMax5(int taMax5) {
		this.taMax5 = taMax5;
	}
	public int getTaMax4() {
		return taMax4;
	}
	public void setTaMax4(int taMax4) {
		this.taMax4 = taMax4;
	}
	public int getTaMin5() {
		return taMin5;
	}
	public void setTaMin5(int taMin5) {
		this.taMin5 = taMin5;
	}
	public int getTaMin4() {
		return taMin4;
	}
	public void setTaMin4(int taMin4) {
		this.taMin4 = taMin4;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getTmFc() {
		return tmFc;
	}
	public void setTmFc(String tmFc) {
		this.tmFc = tmFc;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public MidTaDTO() {}
	public MidTaDTO(String resultCode, String resultMsg, String tmFc, String regId, int taMin4, int taMin5, int taMax4,
			int taMax5) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.tmFc = tmFc;
		this.regId = regId;
		this.taMin4 = taMin4;
		this.taMin5 = taMin5;
		this.taMax4 = taMax4;
		this.taMax5 = taMax5;
	}
	@Override
	public String toString() {
		return "MidTaDTO [resultCode=" + resultCode + ", resultMsg=" + resultMsg + ", tmFc=" + tmFc + ", regId=" + regId
				+ ", taMin4=" + taMin4 + ", taMin5=" + taMin5 + ", taMax4=" + taMax4 + ", taMax5=" + taMax5 + "]";
	}
}
