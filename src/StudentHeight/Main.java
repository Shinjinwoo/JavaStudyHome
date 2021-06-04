package StudentHeight;

import java.util.Scanner;

class Main {
	
	public int solution(int n, int[] arr) {
		
		int count = 1, max=arr[0];
		// 첫번째 사람은 무조건 보이니까 1
		
		for(int i=1; i<n; i++) {
			//입력받은 n번의 숫자만큼 반복문 수행 인덱스가 i가 0인이유는
			//첫번째 사람의 값이 이미 들어가 있기 때문
			if(arr[i]>max) {
				count++;
				//자신보다 큰 사람이 나오면 max 수치가 변경 + 카운트 증가
				max=arr[i];
			}
			
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		//첫번째 자연수 n을 입력 받는다.
		
		int[] arr = new int[n];
		//입력받은 자연수의 숫자만큼의 크기를 가진 배열을 동적할당
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
			//값을 받는다.
		}
		
		System.out.println(T.solution(n, arr));
		
		
		
		
	}
	

}
