package sort;

public class BubbleSort {
	
	/* [ �������� ]
	 * ���� �ִ� ���� ���ؼ� ������ ���� ������ ����
	 * 
	 * ���������� �ð� ���⵵�� O(N^2)
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //�����ϴ� ���� ���

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
		
		long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� �ð� ��� �� ���
	}
}
