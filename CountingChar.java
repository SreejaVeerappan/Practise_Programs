package basic.training.com;

public class CountingChar {

	public static void main(String[] args) {
		String word="Programming";
		char ch;
		char ch1='g';
		int count=0;
		for(int i=0;i<word.length();i++) {
			ch=word.charAt(i);
			if(ch==ch1) {
			count++;			
			}
			}
	System.out.println(count);	
	}

}
