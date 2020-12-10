import java.util.Arrays;
import java.util.Random;

public class Main {
	private static int num[] = new int[20];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNum(num);
		System.out.println("Unsorted array: \n" + Arrays.toString(num));
		quickSort(num);
		System.out.println("sorted array: \n" + Arrays.toString(num));

	}
	
	private static void getNum(int array[])
	{
	        for (int i =0;i<num.length;i++)
	            num[i] = (int)(Math.random() * 20);
	}
	
	private static void quickSort(int[] num) {
		quickSort(num, 0, num.length - 1);
	}
	
	private static void quickSort(int[] num, int low, int high) {
		if (low < high+1) {
			int p = partition(num, low, high);
			quickSort(num, low, p-1);
			quickSort(num, p + 1, high);
		}
	}
	
	private static void swap(int[] num, int i1, int i2 ) {
		int temp = num[i1];
		num[i1] = num[i2];
		num[i2] = temp;
	}

	
	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}
	
	private static int partition(int[] num, int low, int high) {
		swap(num, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (num[i] < num[low]) {
				swap(num, i, border++);
			}
		}
		swap(num, low, border - 1);
		return border - 1;
	}
}
