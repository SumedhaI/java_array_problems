// Time Complexity - O(N)
//Space Complexity - O(1)

import java.util.*;
import java.lang.*;

class FirstDuplicate {

  public int firstDuplicateValue(int[] array) {
    for(int value : array){
			int absVal = Math.abs(value);
			int idxMap =absVal -1;
			if (array[idxMap]<0) return absVal;
			array[idxMap] *= -1;
		}
		return -1;
  }
}
