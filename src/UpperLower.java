import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer = "";
		
		for ( int i=0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i)))  {
				answer += Character.toUpperCase(str.charAt(i));
			}
			
			else {
				answer += Character.toLowerCase(str.charAt(i));
			}
		}
		
		return answer;
	}
		
	
	
	public static void main(String[] args) {
	
		
		Main T = new Main();
		
		Scanner Keyboard = new Scanner(System.in);
		String str = Keyboard.next();
		
		System.out.println(T.solution(str));
		
	}

}
