class Solution {
    public int mySqrt(int x) {    //8
        if(x<2)return x;
        int i=2;            //2
        while(i*i <= x){      //3*3 <=8    true
            i+=1;             //3;
        }
        return i-1;        //3-1
    }
	void main() {
		int n = 2;
		Solution obj = new Solution();
		obj.mySqrt(n);
		IO.println();
	}
}