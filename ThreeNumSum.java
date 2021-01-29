import java.util.*;

class ThreeNumSum {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		List<Integer[]> final_arr = new ArrayList<Integer[]>();
		for(int num = 0; num<array.length-2; num++){
			int l =num+1;
			int r = array.length-1;
			int currSum = 0;
			while(l<r){
				currSum = array[num]+array[l]+array[r];
				if(currSum<targetSum)
					l++;
				else if(currSum>targetSum)
					r--;
				else if(currSum == targetSum){
					Integer[] triplet = {array[num],array[l],array[r]};
					final_arr.add(triplet);
					l++;
					r--;
				}
			}
		}
		
    return final_arr;
  }
}
