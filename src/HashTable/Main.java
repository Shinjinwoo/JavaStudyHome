package HashTable;

import java.util.HashMap;
import java.util.Scanner;

class Main {
	
	public char solution ( int n , String s ) {
		char answer = ' ';
		// 제네릭 데이터 타입으로 해쉬맵 생성
		HashMap<Character,Integer> map = new HashMap<>();
		//첫번째 인자 : 키 값의 데이터 타입
		//두번째 인자 : 벨류값의 데이터 타입
		//map.put('A',3);
		//해쉬 테이블의 A라는 키를 가진 3의 벨류를 넣음
		
		int max = Integer.MIN_VALUE;
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
			
			//get은 키의 벨류값을 가져옴.
			//getOrDefault는 x의 키값이 없을 경우 0을 리턴
			//가령 키 B에 2라는 벨류 값이 존재 할 경우 +1을 추가해서 3을 리턴하거나 키가 존재하지 않을경우 0을 리턴
			//또는 E라는 존재하지 않는 키가 새로 들어오게 된다면 1을 리턴해서 새로운 키벨류쌍의 데이터를 해쉬테이블에 넣음.
			
		}
		
		for(char key : map.keySet()) {
			//존재하는 키들을 전부 탐색
			
			
			//map.contaionKey('F')
			//캡에 선택한 키가 있는지 물어보는 메서드
			
			
			//map.size()
			//키의 종류별 개수를 알려줌.
			//중복 X
			
			
			//map.remove('A');
			//A라는 특정키를 삭제함
			
			
			
			
			
			if(map.get(key) > max ) {
				max=map.get(key);
				answer=key;
				
			}
			/* System.out.println(key + " " + map.get(key)); */
			
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}

}
