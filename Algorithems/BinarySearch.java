class BinarySearch {
	void main() {
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int key = 9;              //
		int start = 0;            //0
		int end = arr.length-1;   //8
		
		boolean flag = false;    //false
		
		while (start<=end) {           //0<8
			int mid = (start+end)/2;      //mid = 5+(8-5)/2
												   //mid = 4
			if(key==arr[mid]) {
				System.out.println("Key found " + mid);     //
				flag = true;
				break;
			}
			else if(key<arr[mid]) {      //4<5     
				end=mid-1;  //end = 4-1   = 3
			}            
			else {     //
				start=mid+1;       //start = 4+1
			}
		}
			if (!flag) {
            System.out.println("Element not found");
			}
			
	}
}