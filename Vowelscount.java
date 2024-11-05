package basic.training.com;

import java.util.Arrays;

public class Vowelscount {

	public static void main(String[] args) {
		String str="Hii! hello all";
		
		System.out.println();
		
	}
		static int[] vowIden(String str) {
			char[] vowels={'a','e','i','o','u'};
			char[] cstr=str.toLowerCase().toCharArray();
			int vcount=0;
			int ccount=0;
			
			for(int i=0;i<vowels.length;i++) {
				for(int j=0;j<cstr.length;j++) {
					if(vowels[i]==cstr[j]) {
						vcount++;
					}
			}
				if(i==0 && 'a'<=cstr[j] && cstr[j]<='z') {
				ccount++;
				}
			}
			return new int[] {vcount,ccount};

		}}