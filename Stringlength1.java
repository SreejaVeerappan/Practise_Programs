package basic.training.com;

public class Stringlength1 {

	public static void main(String[] args) {
		String str="hello";
		System.out.println("The string is hello");
		int count=0;
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch!=0){
			count+=1;
		}
		}
			System.out.println(count);
	}

}
