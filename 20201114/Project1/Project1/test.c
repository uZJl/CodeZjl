#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

void Init(int arr[], int set, int len)
{
	for (int i = 0; i < len; i++)
	{
		arr[i] = set;
	}
}


void Print(int arr[], int len)
{
	for (int i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void Reverse(int arr[],int len)
{
	
	int right = len - 1;
	int left = 0;
	while (right > left)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
}

int main()
{
	int arr1[10] = { 1,2,3,4,5,6,7,8,9,0 };
	int l = sizeof(arr1) / sizeof(arr1[0]);
	Print(arr1,l);
	Reverse(arr1,l);
	Print(arr1,l);
	Init(arr1, 0,l);
	Print(arr1, l);
	return 0;
}
