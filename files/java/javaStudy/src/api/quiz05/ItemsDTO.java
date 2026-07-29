package api.quiz05;

public class ItemsDTO {
	private String imageUrl; // 1~6까지 있지만 한개만
	private String dataTime;
	private String informOverall; // informGrade에 지역별이 있지만 일단 전 권역만
	private String informCode;
	
	
	@Override
	public String toString() {
		return "ItemsDTO [imageUrl=" + getImageUrl() + ", dataTime=" + getDataTime() + ", informOverall=" + getInformOverall()
				+ ", informCode=" + getInformCode() + "]";
	}


	public String getInformCode() {
		return informCode;
	}


	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}


	public String getInformOverall() {
		return informOverall;
	}


	public void setInformOverall(String informOverall) {
		this.informOverall = informOverall;
	}


	public String getDataTime() {
		return dataTime;
	}


	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
