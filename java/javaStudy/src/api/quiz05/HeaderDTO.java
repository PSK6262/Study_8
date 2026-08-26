package api.quiz05;

public class HeaderDTO {
	private String resultMsg;
	private String resultCode;
	
	
	@Override
	public String toString() {
		return "HeaderDTO [resultMsg=" + getResultMsg() + ", resultCode=" + getResultCode() + "]";
	}


	public String getResultCode() {
		return resultCode;
	}


	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}


	public String getResultMsg() {
		return resultMsg;
	}


	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
}
