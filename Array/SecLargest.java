

public class SecLargest {
        public static int ret(int arr [] ) {
            int max = Integer.MIN_VALUE;
            int sec = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length;i++) {
                if(arr[i] > max) {
                    int temp = max;
                    sec = temp;
                    max = arr[i];
                }
                else if (arr[i] < max && arr[i] > sec) {
                    sec = arr[i];
                }
            }
            return sec;
        }
    }
