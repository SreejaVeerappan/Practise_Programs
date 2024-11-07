package basic.training.com;

public class CountnoOfdigits {

	public static void main(String[] args) {
		int i=1023;
		int count=0;
		while(i!=0) {
			i/=10;
			count++;
		}
		System.out.println(count);
	}

}
