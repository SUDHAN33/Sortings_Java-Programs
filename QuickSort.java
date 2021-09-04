package sortings;
import java.util.*;
public class QuickSort {

	private static void quicksort(int[] input,int s,int e) {
		if(s>=e) {
			return;
		}
		int pivotpos = Partition(input,s,e);
		quicksort(input,s,pivotpos-1);
		quicksort(input,pivotpos+1,e);
	}
	public static int Partition(int [] input,int s,int e) {
		int pivot = input[s];
		int count =0;
		for(int i=s+1;i<=e;i++) {
			if(pivot >= input[i]) {
				count++;
			}
		}
		int pivotpos = s+count;
		int temp = input[s];
		input[s] = input[pivotpos];
		input[pivotpos] = temp;
		int i =s;
		int j=e;
		while(i<pivotpos && j>pivotpos) {
			if(input[i] <= input[pivotpos]) {
				i++;
			}
			else if(input[j] > input[pivotpos]) {
				j--;
			}
			else {
				int temp1 = input[i];
				input[i] = input[j];
				input[j] = temp1;
				i++;
				j--;
			}
		}
		 return pivotpos;
	}
	public static void quicksort(int[] input) {
		quicksort(input,0,input.length-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		quicksort(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
		
	

}
