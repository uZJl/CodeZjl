#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

int fun(int n)
{
	int sum = 0;

	int t = 0;
	for (int i = 1; i <= 5; i++)
	{
		
		t = t * 10 + n;
		sum += t;
	}

	return sum;
}

int main()
{
	int a = 0; 
	scanf("%d", &a);
	printf( "%d", fun(a) );
	return 0;
}