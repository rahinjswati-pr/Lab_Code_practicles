#include<stdio.h>
int main()
{
	int no,i;
	printf("Enter num");
	scanf("%d",&no);
	printf("factor of %d are",no);
	for(i=1;i<=no;i++)
	{
		if(no%i==0)
		{
			printf("%d",i);
		}
	}
}
