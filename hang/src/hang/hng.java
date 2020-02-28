package hang;

import java.util.ArrayList;
import java.util.Scanner;

public class hng {
	
	static public void guess(String word, int life) {
		char[] filler=new char[word.length()];
		int i=0;
		while(i<word.length()) {
			filler[i]='-';
			if(word.charAt(i)==' ') {
				filler[i]=' ';
			}
			i++;
		}
		System.out.print(filler);
		System.out.print("     Life="+life);
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<Character> l=new ArrayList<Character>();
		
		while(life>0) {
			char x=s.next() .charAt(0);
			
			if(l.contains(x)) {
				System.out.println("Already Enterd");
				continue;
			}
			
			l.add(x);
			
			if(word.contains(x+"")) {
				for(int y=0;y<word.length();y++) {
					if(word.charAt(y)==x) {
						filler[y]=x;
					}
				}
			}
			else {
				life--;
			}
			
			if(word.equals(String.valueOf(filler))) {
				System.out.println(filler);
				System.out.println("You Win!!!");
				break;
			}
			
			System.out.print(filler);
			System.out.print("     Life="+life);
		}
		
		if(life==0) {
			System.out.println("You Lose");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String word="oh shit";
		int life=5;
		guess(word,life);
	}

}
