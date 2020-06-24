package sort;

public class QuickSort {
	/* [ 퀵정렬 ]
	 * 
	 * 
	 * 퀵정렬의 시간 복잡도는 O(N^logN)
	 */
	
	public static int array[] = {1, 10, 5, 7, 8, 6, 4, 3, 2, 9};
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //시작하는 시점 계산
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("[결과]");
		show();
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력

	}
	
	public static void quickSort(int data[], int start, int end) 
	{
		if(start>=end) {return ;} //원소가 한개일 경우 그냥 두기
		
		int key = start;
		int i = start + 1, j=end, temp;
		
		while ( i <= j ) {
			while(i <= end && data[i]<=data[key]) { 
				i++;
			}
			
			while(j>start&& data[j]>=data[key]) {
				j--;
			}
			
			
			if(i > j) {
				temp 	  = data[j];
				data[j]   = data[key];
				data[key] = temp;
			}else {
				temp 	  = data[i];
				data[i]   = data[j];
				data[j]   = temp;
			}
			show();
			System.out.println();
		}
		
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
	
	public static void show() {
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
}
