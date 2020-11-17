#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

void fun(char arr[], int len)
{
	for (int i = len - 1; i >= 0; i--)
	{
		printf("%c ", arr[i]);
	}
}

int main()
{
	char arr1[] = "djakfngnskg";
	int len = sizeof(arr1) / sizeof(arr1[0]);
	fun(arr1, len);
	printf("\n");
	return 0;
}
