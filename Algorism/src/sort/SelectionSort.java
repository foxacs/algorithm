package sort;

public class SelectionSort {
	
	/* [ 선택정렬 ]
	 * 가장 작은 것을 선택해서 제일 앞으로 보냄
	 * 
	 * 선택정렬의 시간 복잡도는 O(N^2)
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		int array[] = {1, 10, 5, 7, 8, 6, 4, 3, 2, 9};
		int min, index=0, temp;
		
		for(int i=0; i<array.length; i++) {
			min = array[i];
			index = i;
			
			for(int j= i; j<array.length; j++) {
				if(array[j] < min) 
				{
					min = array[j];
					index =j;
				}
			}
			
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력

	}
}
