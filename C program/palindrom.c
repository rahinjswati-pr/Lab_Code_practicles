#include<stdio.h>
void main()
{
	int n,rev=0,rem,orig;
	printf("enter integer");
	scanf("%d",&n);
	orig=n;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	if(orig==rev)
	printf("%d is palindrome",orig);
	else
	printf("%d not palindrom",orig);
}
