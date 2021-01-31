import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
		if(array.length == 0) return new ArrayList<Integer>();
    List<Integer> results= new ArrayList<Integer>();
		int sc = 0;
		int sr = 0;
		int er = array.length-1;
		int ec = array[0].length - 1;
		
		while(sc<=ec && sr<= er){
			for(int col = sc; col<=ec; col++){
				results.add(array[sr][col]);
			}
			for(int row = sr+1; row<=er; row++){
				results.add(array[row][ec]);
			}
			for(int col = ec-1; col>=sc; col--){
				if(sr==er){
					break;
				}
				results.add(array[er][col]);
			}
			for(int row = er-1; row>=sr+1; row-- ){
				if(sc==ec){
					break;
				}
				results.add(array[row][sr]);
			}
			sr++;
			sc++;
			er--;
			ec--;
		}
		
    return results;
  }
}
