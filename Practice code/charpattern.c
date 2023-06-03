#include<stdio.h>
int main()
{
	char i,j,count='A';
	for(i='A';i<='D';i++)
	{
		for(j='A';j<=i;j++)
		{
			printf("%c",count);
			count++;
		}
		printf("\n");
	}
}
