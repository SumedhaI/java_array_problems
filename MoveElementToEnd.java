//Time Complexity - O( n log n)
//Space Complexity - O( 1 )

import java.util.*;

class MoveElementToEnd {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    Collections.sort(array);
		int end = array.size()-1;
		int i = 0;
		while(i<end){
			if(array.get(i)==toMove){
				array.set(i, array.get(end));
				array.set(end, toMove);
				end--;
			}
			else
				i++;
		}
		
    return array;
  }
}
