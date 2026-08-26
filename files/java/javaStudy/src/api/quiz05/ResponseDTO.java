package api.quiz05;

public class ResponseDTO {
	private BodyDTO body;
	private HeaderDTO header;
	
	@Override
	public String toString() {
		return "ResponseDTO [body=" + getBody() + ", header=" + getHeader() + "]";
	}

	public HeaderDTO getHeader() {
		return header;
	}

	public void setHeader(HeaderDTO header) {
		this.header = header;
	}

	public BodyDTO getBody() {
		return body;
	}

	public void setBody(BodyDTO body) {
		this.body = body;
	}
}
