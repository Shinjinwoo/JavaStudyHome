package Stack;

import java.util.Scanner;
import java.util.Stack;

class Main { 
	
	//스택이 비어있나 확인하는것  isEmpty
	//스택이 비어있으면 참 , 비어있지 않으면 거짓
	
	public String solution(String str) {
		String answer="YES";
		
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if ( x == '(') {
				stack.push(x);
			}
			else {
				// '(' 괄호가 아니면  ')' 괄호이다. ')' 괄호는 꺼내는 괄호이다.
				if(stack.isEmpty()) {
					
					return "NO";
					// 꺼내는 괄호인데 스택이 비어 있다면 닫는 괄호의 짝궁인 여는 괄호가 존재하지 않는것.
					// 바로 return "NO"를 한다.
				}
				
				stack.pop();
				//스택의 마지막에 있는걸 꺼내는것
				//비어 있지 않다면 팝으로 가진다.
				
			}
		}
		
		/*---------------------------------------*/
		
		if( !stack.isEmpty()) {
			//스택이 뭔가 자료가 남아있으면 참이지만 NOT연산자를 사용해서 거짓이다.
			return "NO";
			//뭐가 자료가 남아 있다는것은 여는 괄호가 많이 있다는 것이다.
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		// 제네릭 타입을 사용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있다.
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		
		System.out.println(T.solution(str));
		
	}

}
