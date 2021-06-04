package AlphabeticPalindrome;

import java.util.Scanner;

class Main {
	
	public String solution(String s) {
		String answer = "NO";
		
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		
		// 정규화 대문자 A부터Z 까지가 아니면 
		
		String tmp = new StringBuilder(s).reverse().toString();
		
		// String 객체 tmp에 스트링빌더를 이용. 리버스한후 String으로 저장
		
		if (s.equals(tmp)) {
			
		//equals 메소드를 통해 문자를 거꾸로 변환후 저장한 tmp와 비교
			answer = "YES";
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		
		
		System.out.println(T.solution(str));
		
	}

}
