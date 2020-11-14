#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

void Swap(int arr1[], int arr2[],int len)
{
	for (int i = 0; i<len; i++)
	{
		int temp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = temp;
	}
}

int main()
{
	int A[10] = { 1,2,3,4,5,6,7,8,9,0 };
	int B[10] = { 0,9,8,7,6,5,4,3,2,1 };
	int l = sizeof(A) / sizeof(A[0]);
	Swap(A, B,l);
	for (int i = 0; i < l; i++)
	{
		printf("%d ", A[i]);
	}
	printf("\n");
	for (int i = 0; i < l; i++)
	{
		printf("%d ", B[i]);
	}
	printf("\n");
	return 0;
}