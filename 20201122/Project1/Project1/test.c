#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

void swap(char* arr,int len)
{
	if (arr = NULL)
		return;
	int left = 0;
	int right = len - 1;
	char temp;
	while (left < right)
	{
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
}

void word(char* )

