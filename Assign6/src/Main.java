import java.util.Arrays;

public class Main {
	
	private static int num[] = new int[100];
	private static int helper[] = new int[100];
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNum(num);
		System.out.println("Unsorted array: \n" + Arrays.toString(num));
		
		mergeSort(0, 99);
		System.out.println("Sorted array: \n" + Arrays.toString(num));
	}
	
	private static void getNum(int array[])
	{
	        for (int i =0;i<num.length;i++)
	            num[i] = (int)(Math.random() * 100);
	}

	private static void mergeSort(int low, int high)
	{
		//base case. If low is less than high then it already is sorted
		if (low < high)
		{
			int mid = low + (high - low) / 2;
			
			//Left
			mergeSort(low, mid);
			
			//right
			mergeSort(mid + 1, high);
			
			merge(low, mid, high);
		}
	}
	
	private static void merge(int low, int mid, int high)
	{
		for (int i = low; i <= high; i++) {
			helper[i] = num[i];
		}
			int a = low;
			int b = mid + 1;
			int c = low;
			
			//used to put the smaller int into the array
			while (a <= mid && b <= high) 
			{
				if (helper[a] <= helper[b])
				{
					num[c] = helper[a];
					a++;
				}
				else
				{
					num[c] = helper[b];
					b++;
				}
				c++;
			}
			
			while (a <= mid)
			{
				num[c] = helper[a];
				a++;
				c++;
				
			}
		
	}
}
