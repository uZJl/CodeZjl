#include<stdio.h>

int weiShu(int n)
{
	int count = 0;
	while (n > 0)
	{
		count++;
		n /= 10;
	}
	return count;
}

int isShuixian(int n,int num)
{
	int sum = 0;
	int i = 0;
	int a = n;
	int j = 1;
	while (a > 0)
	{
		int temp = a % 10;
		a = a / 10;
		for (int i = num; i > 0; i--)
		{
			j *= temp;
		}
		sum += j;
		j = 1;
	}
	if (sum == n)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	
}
int main()
{
	
	for (int i = 0; i < 100000; i++) 
	{
		int num = weiShu(i);
		if (isShuixian(i,num))
		{
			printf("%d\n", i);
		}
	}
	return 0;
}