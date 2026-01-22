class RETAPP {
	public static void main(String [] args) {
		int arr[] = {2,3,5,7,9,0,3};  
		int result = retArr(arr);
		System.out.println(result);
	}
	
	public static int retArr(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
}