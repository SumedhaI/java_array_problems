//Time Complexity O(N)

import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
    int max_len = 0;
		int i=1;
		
		while(i<array.length-1){
			boolean isPeak = array[i]>array[i-1] && array[i]>array[i+1];
			if(! isPeak){
				i++;
				continue;
			}
			int leftIdx = i-2;
			int rightIdx = i+2;
			int count = 3;
			while(leftIdx>=0 && array[leftIdx]<array[leftIdx+1]  ){
					leftIdx--;
				count++;
			}
			while(rightIdx<array.length && array[rightIdx]<array[rightIdx -1] ){
				rightIdx++;
				count++;
			}
			if(max_len<count){
				max_len = count;
			}
			i= rightIdx;
		}
		
    return max_len;
  }
}
