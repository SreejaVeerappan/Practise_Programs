package basic.training.com;

public class RemoveVowel {

	public static void main(String[] args) {
		String word="beautiful";
		char ch;
		StringBuilder nw=new StringBuilder();
		
		for(int i=0;i<word.length();i++) {
			ch=word.charAt(i);
			
			
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				nw.append(ch);
				}}
			System.out.println(nw);
		 
		      }
		    

		   
//
	}


