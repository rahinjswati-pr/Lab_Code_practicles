#include<stdio.h>
void main()
{
  int no,i,rev=0,rem;
  printf("enter number");
  scanf("%d",&n);
  while(n!=0)
  {
  	rem=n%10;
  	rev=rev*10+rem;
  	n/10;
  }
  printf("reversed number=%d",rev);
  

}
