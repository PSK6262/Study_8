package db.v3;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateUtil {
	// Timestamp -> LocalDateTime
	public static LocalDateTime convertTimestampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}
	
	// LocalDateTime -> Timestamp
	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}
	
	// String -> LocalDateTime
	public static LocalDateTime convertDateTimeStringToLocalDateTime(String str) {
		//					2020-05-30 12:33:44
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.parse(str, fmt);
		
		return ldt;
	}
	
	// String -> LocalDateTime
	public static LocalDateTime convertDateStringToLocalDateTime(String str) {
		//					2020-05-30 12:33:44
		//					2020/05/30
		//					20200530 
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld.atStartOfDay();
	}
	
	public static LocalDateTime convertDateStringToLocalDateTime2(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld.atStartOfDay();
	}
	
	public static LocalDateTime convertDateStringToLocalDateTime3(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld.atStartOfDay();
	}
		//convertDateStringToLocalDateTimeWithFormat("2022-02-02", "yyyy-MM-dd");
	public static LocalDateTime convertDateStringToLocalDateTimeWithFormat(String str, String format) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld.atStartOfDay();
	}
	
	// String -> LocalDate
	public static LocalDate convertDateStringToLocalDate(String str) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, fmt);
		
		return ld;
	}
	
	// LocalDate -> LocalDateTime
	public static LocalDateTime convertLocalDateToLocalDateTime(LocalDate ld) {
		return ld.atStartOfDay();
	}
	
	// LocalDateTime -> String
	public static String convertLocalDateTimeToString(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return ldt.format(fmt); // -> 해당 포맷 형태의 string
	}
	
	public static String convertLocalDateTimeToString2(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
		return ldt.format(fmt); // -> 해당 포맷 형태의 string
	}
	
	public static String convertLocalDateTimeToString3(LocalDateTime ldt) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return ldt.format(fmt); // -> 해당 포맷 형태의 string
	}
	
	//public static String convertLocalDateTimeToStringWithFormat(LocalDateTime ldt, String format) {
	public static String convertLocalDateTimeToString(LocalDateTime ldt, String format) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
		return ldt.format(fmt); // -> 해당 포맷 형태의 string
	}
	
}
