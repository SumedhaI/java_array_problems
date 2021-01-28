import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int j=0;
		int i=0;
		while(i< array.size() && j<sequence.size()){
			if(array.get(i)!= sequence.get(j))
				i++;
			else{
				i++;
				j++;
			}
		}
		if(j==sequence.size())
			return true;
		else 
			return false;
		// return false;
  }
}
