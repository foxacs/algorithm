package common;

public class AlgorismUtil {
	int [] arr = null;
	int defautSize = 100;
	
	public int[] insertRandomNumber(int size, int range) 
	{
		this.arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * range +1); 
		}
		
		return arr;
	}
	
	public int[] insertRandomNumber(int size) 
	{
		if(size > defautSize) {
			return null;
		}
		
		this.arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * defautSize +1); 
		}
		
		return arr;
	}
	
	//중복되지 않는 랜덤의 수를 담은 배열을 반환한다 
	public int[] noDuplicationRandomNumber(int size) 
	{
		if(size > defautSize) {
			return null;
		}
		
		this.arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			
			int temp;
			
			while(true) {
				temp = (int) (Math.random() * defautSize +1);
				
				if(duplicationCheck(temp) == 0) {break;}
			}
			
			arr[i] = temp;
		}
		
		return arr;
	}
	

	public int[] noDuplicationRandomNumber(int size, int range) 
	{
		this.arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			
			int temp;
			
			while(true) {
				temp = (int) (Math.random() * range +1);
				
				if(duplicationCheck(temp) == 0) {break;}
			}
			
			arr[i] = temp;
		}
		
		return arr;
	}
	
	
	public int duplicationCheck(int number)
	{
		
		if(this.arr == null) {return -1;}
		
		for(int i =0; i<arr.length; i++) 
		{
			if(arr[i] == number) 
			{
				return -1;
			}
		}
		
		return 0;
	}
	
	public void printArr(int[] arr) 
	{
		for(int i =0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
