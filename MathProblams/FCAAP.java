class FCAAP {
	void main() {
		int num = 11224456;
		int oregional = num;
		for(int i=0;i<=9;i++) {
		
			num = oregional;
			int count = 0;
			
			while(num>0) {
				int lastdigit = num%10;
				if(lastdigit == i)  {
					count++;
				}
				num = num/10;
			}
			if(count > 0) {
				System.out.println(i + " -> " + count);
			}
		}
	}
}