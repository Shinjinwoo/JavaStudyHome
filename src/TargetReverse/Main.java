package TargetReverse;


import java.util.Scanner;

class Main {

	public String solution( String str ){
		
		String answer;
		
		char[] s = str.toCharArray();
		int lt = 0 , rt = str.length()-1;
		
		while( lt < rt ) {
			if(!Character.isAlphabetic(s[lt])){
				// 알파벳일때 참이됨 
				// ! 을 넣음으로써 알파뱃이 `아닐때` 참이됨으로 설정
				lt ++;
			}
			
			else if (!Character.isAlphabetic(s[rt])){
				// rt가 알파벳이 아닐때 rt 감소
				rt --;
			}
			
			else {
				char tmp = s[lt];
				// Char 자료형 구조인 tmp에 Char형 배열 s의 0번째 [lt] 인덱스의 값을 저장;
				s[lt]=s[rt];
				// s배열 lt번재 값에 Right 즉 배열 s의 rt 값을 저장.
				s[rt]=tmp;
				// rt는 tmp에 저장된 값으로 문자열 뒤집기 
				lt++;
				// lt를 가리키는 포인터를 증가시킨다.
				rt--;
				// rt를 가리키느 포인터를 증가시킨다.
				
			}
		}
		
		answer = String.copyValueOf(s);
		// s라는 캐릭터형 기본형 데이트를 스트링 객체화
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
		
		
		
	}
	
}
