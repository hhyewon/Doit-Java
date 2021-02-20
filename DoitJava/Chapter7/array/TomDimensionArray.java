package array;

public class TomDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3} , {4,5,6}}; // 2행 3열
		
		System.out.println(arr.length);   //행의 개수
		System.out.println(arr[0].length);  // 0행 길이
		System.out.println(arr[1].length); //1행 길이
		
		for(int i=0; i< arr.length; i++ ) {
			for(int j=0; j< arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
