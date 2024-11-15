package task;

public class findunique {

	public static void main(String[] args) {
		int count;
		int[] num= {1,3,1,3,4,9};
		
		System.out.println("length:"+num.length);
		for(int i=0;i<=num.length-1;i++) {
			count=0;	
			for(int j=0;j<num.length;j++) {
				if(i!=j&&num[i]==num[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(num[i]);
			}
		
//		System.out.print(count);
		}
		
	}

}


