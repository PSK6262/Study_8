package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.file.FileInfo;

public class FileManager {
	
	static final String FILE_STORAGE_PATH = "D:/FileStorage/";
	static final String FILE_URL_PATH = "/fileStorage/";
	
	public static FileInfo storeFile(MultipartFile file) throws IllegalStateException, IOException {
		// 전달받은 파일 -> 가공
		// 파일에 대한 정보를 담은 객체 FIleInfo
		FileInfo fileInfo = new FileInfo();
		fileInfo.setOriginalFileName(file.getOriginalFilename());
		fileInfo.setFilePath(FILE_STORAGE_PATH);
		fileInfo.setUrlFilePath(FILE_URL_PATH);
		
		String fileName = createNewFileName(file.getOriginalFilename());
		fileInfo.setFileName(fileName);
		
		file.transferTo(new File( fileInfo.getFilePath() , fileInfo.getFileName()) );
		
		return fileInfo;
	}
	static String createNewFileName(String fileName) {
		return createFileName(extractExtension(fileName));
	}
	
	static String createFileName(String extension) {
		
		String filename = UUID.randomUUID().toString();
		filename += ("." + extension);
		return filename;
	}
	static String extractExtension(String fileName) {
		// 확장자 뽑기
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}
}
