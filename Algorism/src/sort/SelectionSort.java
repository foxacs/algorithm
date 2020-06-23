package sort;

public class SelectionSort {
	
	/* [ �������� ]
	 * ���� ���� ���� �����ؼ� ���� ������ ����
	 * 
	 * ���������� �ð� ���⵵�� O(N^2)
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //�����ϴ� ���� ���

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
		
		long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� �ð� ��� �� ���

	}
}
