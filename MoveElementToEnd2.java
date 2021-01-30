import java.util.*;

class MoveElementToEnd2 {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    
		int end = array.size()-1;
		int i = 0;
		while(i<end){
			if(array.get(end)==toMove){
				end--;
			}
			else if(array.get(i)== toMove){
				array.set(i, array.get(end));
				array.set(end, toMove);
				end--;
				i++;
			}
			else if(array.get(i)!= toMove){
				i++;
			}
		}
		
		
    return  array;
  }
}
