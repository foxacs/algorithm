package sort;

public class BubbleSort {
	
	/* [ 버블정렬 ]
	 * 옆에 있는 값과 비교해서 더작은 값을 앞으로 보냄
	 * 
	 * 버블정렬의 시간 복잡도는 O(N^2)
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		int array[] = {1, 10, 5, 7, 8, 6, 4, 3, 2, 9};
		
		
		for(int i=0; i < array.length; i++) {
			
			for(int j= 0; j< array.length -1 -i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
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
