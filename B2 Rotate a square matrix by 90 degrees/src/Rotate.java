
public class Rotate {
	public static void main(String[] args) {
		int[][] square = {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(square);
	}

	private static void rotateMatrix(int[][] square) {
		int size = square.length;
		for(int layer=0; layer<size/2; layer++){
			int first = layer;
			int last = size-layer-1;
			for(int i=first; i<last; i++){
				int offset = i-first;
				int temp = square[first][i];
				square[first][i]=square[last-offset][first];
				square[last-offset][first]=square[last][last-offset];
				square[last][last-offset]=square[i][last];
				square[i][last]=temp;
			}
		}
		for(int[] a : square){
			for(int b : a){
				System.out.println(b);
			}
		}
	}
}
