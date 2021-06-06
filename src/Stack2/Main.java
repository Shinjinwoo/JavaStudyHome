package Stack2;

import java.util.Scanner;
import java.util.Stack;

class Main {
	
	public int solution(String s) {
		int answer = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				
				//Character 메서드에 isDigit메서드를 이용한다.
				//isDigit = 숫자인지 물어보는 메서드이다.
				
				stack.push( x -48 );
				//정수형으로 변환 해주지 않으면 아스키코드로 들어가 버린다.
				//가령 숫자 5를 입력할 시 5의 아스키 코드는 53이 된다. 이 값을 그대로 푸쉬 해버릴 경우 스택에는 숫자 5가 아니라 아스키 코드인 53이 푸쉬 되기 때문에
				//-48을 해줘야 실제 숫자 5가 된다.
			}
				
			else {
				//숫자가 아닌 경우를 만난 경우는 연산자를 만난 것이다.
				int rt = stack.pop();
				int lt = stack.pop();
					
				if( x == '+' ) {
					stack.push(lt + rt);
				}
				
				else if ( x == '-' ) {
					stack.push(lt - rt);
				}
				
				else if ( x == '*' ) {
					stack.push(lt * rt);
				}
				
				else if ( x == '/' ) {
					stack.push(lt / rt);
				}
			}		
		}	
		answer = stack.get(0);
		//스택에 마직에 남아 있는 후위연산자가 끝는 값을 answer에 저장한다.
		
	
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		
		System.out.print(T.solution(str));
		
	}
	

}
