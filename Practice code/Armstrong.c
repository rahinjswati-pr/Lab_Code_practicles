#include<stdio.h>
int main()
{
	int num,orignum,rem,result=0;
	printf("enter the integer");
	scanf("%d",&num);
	orignum=num;
	while(orignum!=0)
	{
		rem=orignum% 10;
		result+=rem*rem*rem;
		orignum/=10;
	}
	if(result==num)
	printf("%d Armstrong no",num);
	
	else
	printf("%d not Armstrong no",num);
	return 0;
}

