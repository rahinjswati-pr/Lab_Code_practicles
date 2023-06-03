#include<stdio.h>
void main()
{
	int a,*ptr;
	char str;
	printf("enter value\n");
	scanf("%d",&a);
	printf("value is %d\n",a);
	ptr=&a;
	printf("Address of a is %u\n",&a);
	printf("Address store at pointer %u\n",ptr);
}
