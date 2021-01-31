import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    int left = 1;
		int right = 1;
		int[] prod = new int[array.length];
		
		for(int i=0; i<array.length; i++){
			
			prod[i] = left;
			left *= array[i];
		}
		for(int k=array.length-1; k>=0; k--){
			prod[k] *= right;
			right *= array[k];
			
		}
		return prod;
  }
}
