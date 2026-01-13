
	// Test Data :

	// Input the size of array : 5

	// Input 5 elements in the array in ascending order :
	// 1   2    3    4    5
	
	// Input the position where to delete : 3

	// Expected Output : The new list is : 1 2 3 5

class ArrayQ10 {
	 public static void main(String [] args) {
		 // Scanner sc = new Scanner(System.in);
		 // System.out.println("Enter The Size");
		 // int size = sc.nextInt();
			 // int element=0;
		 // int [] arr = new int [size];
		 // System.out.println("Enter The Elements");
		 // for(int i=0;i<arr.length;i++){
			  // element = sc.nextInt();
			// arr[i] = element; 
		 // }
		// System.out.println("Enter The Elements");

		 // int position = sc.nextInt();
		 // int index = position - 1; // convert position to index
		 // for(int i = index ; i<arr.length-1;i++) {
				// arr[i] = arr[i+1];
			 // }
			 
			int arr [] = {1,2,3,4,5,6,7};
			int idx =2;
		for(int i =idx;i<arr.length-1;i++) {
			   arr[i] = arr[i+1];
		}
			 
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	 }
}