package basic.training.com;

public class Palindrome {

	public static void main(String[] args) {
		String str="hii";
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		if(str==rev) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}

	}

}
