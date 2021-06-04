package ExtractingNumber;

import java.util.Scanner;

class Main {
	
	public int solution (String str) {
		
		String answer = "";
		// 아스키 코드 번호 48~57 ('0'~'9' 까지의 문자형 숫자 )
		

		for(char x : str.toCharArray()) {
			/* 아스키 코드 활용방법
			if ( x >= 48 && x <= 57)
			answer = answer * 10 + ( x - 48 );
			//    0 = 0 X 10 + 0 
			//    1 = 1 X 10 + 1
			//   12 = 1 X 10 + 2
			//  120 = 12 X 10 + 0
			// 1250 = 120 X 10 + 5 */
			
			if(Character.isDigit(x)){
				answer += x;
			}
			
			// 메소드를 이용하면 간편하게 정리가능하다.
			// isDigit = 숫자인지 물어보는 메소드
			
		}
	
		
		return Integer.parseInt(answer);
		//정수형으로 바꿔줌
	}
	
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
		
		
	}

}
