package basic.training.com;

public class Stringreverse {

	public static void main(String[] args) {
//		String str="OpenAi";
//		String[] splithello=str.split("");
//		StringBuilder reversedhello=new StringBuilder();
//		for(int i=splithello.length-1;i>=0;i--) {
//			reversedhello.append(splithello[i]);
//		}
//		System.out.println(reversedhello.toString().toUpperCase());
	String str="hello" , rev="";
	char ch;
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
	rev=ch+rev;	
		
	}
	System.out.println(rev);
	}

}
