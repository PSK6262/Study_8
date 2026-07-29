package api.quiz05;

public class ApiQuiz05Main {
    public static void main(String[] args) {
    	DustFrcstRepository DFR = new DustFrcstRepository();
    	DustFrcstDAO dustFrcstDAO = new DustFrcstDAO();
    	
    	ResponseDTO response = DFR.getResponseFromDustFrcstByDate("2026-07-28");
    	int result = dustFrcstDAO.saveDustFrcst(response);
    	if(result == 1) System.out.println("저장 완료");
    	else System.out.println("에러 발생");
    	
    	response = DFR.getResponseFromDustFrcstByDate("2026-07-29");
    	result = dustFrcstDAO.saveDustFrcst(response);
    	if(result == 1) System.out.println("저장 완료");
    	else System.out.println("에러 발생");
    }
}
