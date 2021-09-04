package sortings;
import java.util.*;
public class MergeSort {
	
	public static void mergeSort(int input[]) {
		if(input.length <=1 ) {
			return;
		}
		int mid = input.length/2;
		int part1[] = new int[mid];
		int part2[] = new int[input.length - mid];
		for(int i=0;i<mid;i++) {
			part1[i] = input[i];
		}
		int k=0;
		for(int i=mid;i<input.length;i++) {
			part2[k] = input[i];
			k++;
		}
		mergeSort(part1);
		mergeSort(part2);
		merge(input,part1,part2);
		
	}
	
	private static void merge(int input[],int part1[],int part2[]) {
		int i=0,j=0,k=0;
		while(i<part1.length && j<part2.length) {
			if(part1[i] < part2[j]) {
				input[k] = part1[i];
				i++;
				k++;
			}
			else {
				input[k] = part2[j];
				j++;
				k++;
			}
		}
		while(i < part1.length) {
			input[k] = part1[i];
			i++;
			k++;
		}
		while(j < part2.length) {
			input[k] = part2[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
        mergeSort(a);
        for(int i=0;i<n;i++) {
	    	   System.out.print(a[i]+" ");
	       }
	}

}
