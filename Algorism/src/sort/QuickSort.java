package sort;

public class QuickSort {
	/* [ ������ ]
	 * 
	 * 
	 * �������� �ð� ���⵵�� O(N^logN)
	 */
	
	public static int array[] = {1, 10, 5, 7, 8, 6, 4, 3, 2, 9};
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //�����ϴ� ���� ���
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("[���]");
		show();
		
		long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� �ð� ��� �� ���

	}
	
	public static void quickSort(int data[], int start, int end) 
	{
		if(start>=end) {return ;} //���Ұ� �Ѱ��� ��� �׳� �α�
		
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
