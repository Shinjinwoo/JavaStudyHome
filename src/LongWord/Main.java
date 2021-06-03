package LongWord;

import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer = "";
		
		int m = 0;
		
		String[] s = str.split(" ");
		
		for(String x : s ) {
			int len = x.length();
			if ( len >  m) {
				m = len;
				answer = x;
			}
		}
		
		
		
		return answer;
	}
	
	
  public static void main(String[] args){
	  
	  Main T = new Main();
	  Scanner kb = new Scanner(System.in);
	  
	  String str=kb.nextLine();
	  
	  System.out.print(T.solution(str));
    
    
  }
}