package com.app.dto.file;

import lombok.Data;

@Data
public class FileInfo {
	String fileName; // PK 실제 저장된 파일이름
	String originalFileName; // 사용자가 업로드 당시에 사용하던 파일명
	String filePath; // 파일이 저장된 경로
	String urlFilePath; // 화면에 파일정보 접근, image url 경로로 접근할 때 필요
}
