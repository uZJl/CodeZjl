#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

void YangHui(int n)
{


	int arr[30][30] = { 1 };
	int i;
	int j;
	for (i = 1; i < n; i++)
	{
		arr[i][0] = 1;//每一行的第一项都是1
		for (j = 1; j <= i; j++)
		{
			arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

		}
		
	}
	for (i = 0; i < n; i++)
	{
		for (j = 0; j <= i; j++)
		{
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}


}
int main()
{
	int n = 0;
	scanf("%d", &n);
	YangHui(n);
}