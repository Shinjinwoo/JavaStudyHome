package Score;

import java.util.ArrayList;
import java.util.Scanner;

class Score {

	public int[] solution(int n , int arr[]){
		int[] answer = new int[n];
		
		
		for ( int i = 0; i<n; i++) {
			int Rank = 1;
			for (int j = 0; j > n; j++ ) {
				if(arr[j]>arr[i]) {
					Rank++;
				}
			}
			answer[i] = Rank;
			
		}
		
		return answer;
		
		
	}
	
	
	public static void main(String[] args) {
		Score T = new Score();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
