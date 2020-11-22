#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
int main()
{
	int arr[4] = {0};
	int i;
	for (i = 0; i < 4; i++)
	{
		arr[i] = 1;
		if ((arr[0] != 1) + (arr[2] == 1) + (arr[3] == 1) + (arr[3] != 1) == 3)
		{
			break;
		}
	}
	printf("%c\n", 'A' + 1);
}