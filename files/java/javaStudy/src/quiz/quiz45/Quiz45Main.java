package quiz.quiz45;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Quiz45Main {
	public static void main(String[] args) {
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"marina", "josipa", "nikola", "filipa"};
		String[] participant3 = {"mislav", "stanko", "ana", "mislav"};
		String[] completion3 = {"mislav", "stanko", "ana"};
		String result1 = solution(participant1, completion1); //leo
		String result2 = solution(participant2, completion2); //vinko
		String result3 = solution(participant3, completion3); //mislav
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	public static String solution(String[] participant, String[] completion){
//		ArrayList<String> sList = new ArrayList<>();
//		for(String s : participant)	sList.add(s);
//		for(String s : completion) sList.remove(s);
//		return sList.get(0);
		
		HashMap<String , Integer> hashMap = new HashMap<>();
		for(String s : participant) {
			if(!hashMap.containsKey(s)) {
				hashMap.put(s, 1);
			}
			else {
				int value = hashMap.get(s);
				hashMap.replace(s, value+1);
			}
		}
		for(String s : completion) {
			if(hashMap.containsKey(s)) {
				int value = hashMap.get(s);
				if(value == 1) hashMap.remove(s);
				else hashMap.replace(s, value-1);
			}
		}
		for(String key : hashMap.keySet()) {
			if(hashMap.get(key) == 1) {
				return key;
			}
		}
		return null;
	}
}
