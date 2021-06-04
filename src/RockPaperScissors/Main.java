package RockPaperScissors;

import java.util.Scanner;

class Main {
	
	public String solution (int n , int arr[], int arr2[]) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			if(arr[i] == arr2[i]) {
				answer+="D";
			}
			
			// 가위 1 , 바위 2 , 보 3
			
			else if (arr[i] == 1 && arr2[i] == 3) {
				answer+= "A";
			}
			
			else if (arr[i] == 2 && arr2[i] == 1) {
				answer+= "A";
			}
			
			else if (arr[i] == 3 && arr2[i] == 2) {
				answer+= "A";
			}
			
			else answer+="B";
			
			
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int [] arr = new int[n];
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(char x : T.solution(n, arr, arr2).toCharArray()) {
		System.out.println(x);
		}
		
		
	}

}
