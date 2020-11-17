#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

void bubbleSort(int arr[], int len)
{
	for (int i = 0; i < len - 1; i++)
	{
		for (int j = 0; i < len - 1 - i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				int tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}
		}
	}
}

void showArr(int arr[], int len)
{
	for (int i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

int main()
{
	int arr1[] = { 12,78,56,98,6,59 };
	int len = sizeof(arr1)/sizeof(arr1[0]);
	showArr(arr1, len);
	bubbleSort(arr1, len);
	showArr(arr1, len);
	return 0;
}