package EratosthenesSieve;

import java.util.Scanner;

class Main {
	
	public int solution (int n) {
		int count = 0 ;
		int[] arr = new int[n+1];
		
		for(int i = 2; i <=n; i++) {
			if (arr[i]==0) {
				count ++;
				
				for (int j=i; j<=n; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		
		
		
		return count ;
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();

		
		System.out.println(T.solution(n));
		
	}

}
