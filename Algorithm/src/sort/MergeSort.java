package sort;

public class MergeSort {
	/* 
	 * 퀵정렬과 마찬가지로 분할정복을 채택한 알고리즘 
	 * 퀵정렬은 피벗값에따라 최악의경우 O(N^2)가 되지만
	 * 분할정렬은 최악의경우에도 시간복잡도 O(N*logN)을 보장한다
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
