package sort;

public class InsertSort {
	/* [ 삽입정렬 ]
	 * 
	 * 
	 * 선택정렬의 시간 복잡도는 O(N^2)
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		int array[] = {1, 10, 5, 7, 8, 6, 4, 3, 2, 9};
		
		for(int i =0; i <array.length; i++) {
			
			for(int j = i; j > 0; j--) {
				if(array[j-1] > array[j]) {
					int temp 	= array[j-1];
					array[j-1] 	= array[j];
					array[j] 	= temp;
				}
				
			}
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력

	}
}
