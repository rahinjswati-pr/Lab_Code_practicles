#include<stdio.h>
void main()
{
	int first,second,*p,*q,sum;
	printf("enter two integer");
	scanf("%d%d",&first,&second);
	p=&first;
	q=&second;
	sum=*p+*q;
	printf("sum of the number=%d",sum);
}

