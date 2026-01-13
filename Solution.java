// Example

// Input: 38

// 3 + 8 = 11

// 1 + 1 = 2

// Output: 2

// Another:

// Input: 0 → Output: 0

// Input: 999 → 9+9+9=27 → 2+7=9 → Output: 9

class Solution {
	void main() {
		int n = 100;
		for (int i = 2; i <= n; i++) {           
			boolean flag = false;
			for (int j = 2; j*j <= i; j++) {
				if (i%j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(i);
			}
		}
	}
}