package sort;

public class MergeSort {
	/* 
	 * �����İ� ���������� ���������� ä���� �˰��� 
	 * �������� �ǹ��������� �־��ǰ�� O(N^2)�� ������
	 * ���������� �־��ǰ�쿡�� �ð����⵵ O(N*logN)�� �����Ѵ�
	 * 
	 */
	public static void main(String[] args) {
		int [] arr = {7,6,5,8,3,5,9,1};
		
		int cnt = 1;
		
		while( true ) 
		{
			if( cnt > 1 ) 
			{
				 for(int i =0; i<arr.length; i=i+2);
			}
			
			cnt=cnt*2;
			
			if(cnt>arr.length) 
			{
				break;
			}
		}
	}
	
	public void mergeSort(int arr[], int left, int right) 
	{
		int mid;
		
		if(left<right) 
		{
			mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public void merge(int arr[], int left, int mid, int right) 
	{
		int i = left;
		int j = mid +1;
		int k = left;
		
		while(i <= mid && j <= right) 
		{
			
		}
		
	}
	
}
