#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

int Num(int money)
{
	int total = money;
	int empty = money;
	while (empty > 1)
	{
		total += empty / 2;
		empty = empty / 2 + empty % 2;
	}
	return total;
}
int main()
{
	int money = 0;
	scanf("%d", &money);
	printf("%d", Num(money));
}