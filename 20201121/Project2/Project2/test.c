#include<stdio.h>

int main()
{
	for (int i = 0; i < 7; i++)
	{
		for (int j = 0; j < 7 - i - 1; j++)
		{
			printf(" ");
		}
		for (int j = 0; j < 2*i + 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for (int i = 0; i < 6; i++)
	{
		for (int j = 0; j < i + 1; j++)
		{
			printf(" ");
		}
		for (int j = 0; j < 2 * (5 - i) + 1; j++)
		{
			printf("*");
		}
		
		printf("\n");
	}

}