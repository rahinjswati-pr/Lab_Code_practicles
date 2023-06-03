#include<stdio.h>
int main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	if(n>0)
	{
		printf("Number is positive");
	}
	else if(n<0)
	{
		printf("Number is negative");
	}
	else
	//if(n==0)
	{
		printf("Number is Zero");
		}	
}
