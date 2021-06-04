package ReversePrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public boolean isPrime(int num) {
		
		if (num == 1) return false;
		// 1은 소수가 아니다.
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				// 자신을 i로 나눈 나머지 값이 0이라면 약수가 존재한다는 의미 
				// 고로 이 숫자는 소수가 아니다.
				return false;
			}
			
			
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n , int [] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				// 1230 이라는 데이터가 들어오면 숫자를 하나하나 뽑아내야 함.
				// 10으로 나눈 나머지는 항상 1의 자리 숫자.
				res = res * 10 + t;
				tmp = tmp / 10;
				
				// 0 * 10 + 0 은 0
				// 0 * 10 + 3 은 3
				// 3 * 10 + 2 는 32
			   // 32 * 10 + 1 은 321
			}
			
			if(isPrime(res)) {
				
				//소수인지 확인 하는 isPrime 메소드 실행 
				answer.add(res);
				//어레이리스트에 추가
			}
			
		}
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		
		for(int x : T.solution(n, arr)) {
		System.out.print(x+" ");
		}
		
		
	}
}
