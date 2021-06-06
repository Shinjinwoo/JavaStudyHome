package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class HashMap1 {
	public String solution(String s1, String s2) {
		String answer="YES";
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0) + 1);
			// 입력받은 첫번째 문자열인 s1의 있는 알파뱃을 키를 기준으로 벨류를 가져온다 getOrDefault를 통해 
		}
		
		for(char x : s2.toCharArray()) {
			if( !map.containsKey(x) || map.get(x) == 0) {
				// or 연산자를 이용해서 X의 키값이 있거나 x의 벨류가 0이면 "NO"를 리턴한다.
				// x의 벨류를 감소하려고 봤더니 값이 0이다. 이는 곧 값이 존재 하지 않는다는 의미.
				return "NO";
			}
			
			map.put(x,map.getOrDefault(x, 0) -1 );
			
		}
		
		
		
		
		return answer;
	}
	 
	 
	 public static void main(String[] args) {
		 
		 HashMap1 T = new HashMap1();
		 Scanner kb = new Scanner(System.in);
		 
		 String a = kb.next();
		 String b = kb.next();
		
		  
		 System.out.print(T.solution(a, b));
		 
		 
		 
		 
	 }
	 
	 

}
