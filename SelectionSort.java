package sortings;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionsort(int a[]) {
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			int min = a[i];
			int minindex = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < min) {
				   min =a[j];
				   minindex =j;
				}
			}
			if(minindex != i) {
			a[minindex] = a[i];
			a[i] = min;
			k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] =  new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		selectionsort(a);
	}
}
