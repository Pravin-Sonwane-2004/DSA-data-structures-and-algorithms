// Q83. Write a java program to print this pattern.
	// 1	A	2	B	3  
      // C	  4   D   5  
		// 6	E	7  
	  // F   8   G   9  
	// H   10	I	11	J

	   //i couldent solve it 
	   
class Q83 {
	void main() {
		char ch = 'A';
		int num = 1;
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=9;j++) {
				if(((j>=i && j<=10-i) && i<=3) || (i>3 && ( j>=6-i && j<=4+i))) {
					if(i%2!=0){
						if(j%3==0) {
					System.out.print(ch++ + " ");
					}  
					else if(j%2==0) {
						System.out.print(num++ + " ");
					}
					}
					else {
						if(j%3==0) {
					System.out.print(ch++ + " ");
					}  
					else if(j%2==0) {
						System.out.print(num++ + " ");
					}
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}