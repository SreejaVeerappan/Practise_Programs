package basic.training.com;
//
//public class Bubblesort {
//
//	public static void main(String[] args) {
//	int arr[]= {1,8,4,2,6};
//	int length=arr.length;
//	
//	for(int i=0;i<length;i++) {
//		for(int j=0;j<i-1;j++) {
//			if(arr[j-1]>arr[j]) {
//				int temp=arr[j];
//				arr[j]=arr[j-1];
//				arr[j-1]=temp;
//			}
//		}
//	}
//	
//for( int i=0;i<length;i++) {
//	System.out.println(arr[i]);
//}}}
public class Bubblesort {

	public static void main(String[] args) {
		int arr[] = {1, 8, 4, 2, 6};
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

