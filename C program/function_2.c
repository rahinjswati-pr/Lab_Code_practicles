#include<stdio.h>
#include<stdlib.h>
struct Employee
{
	int id;
	char name[20];
    float sal;
};
void main()
{
	struct Employee *s;
	int i;
	s=(struct Employee*)malloc(5*sizeof(struct Employee));
	printf("enter Employee record\n");
	for(i=0;i<5;i++)
	{
		scanf("%d%s%f",&s[i].id,&s[i].name,&s[i].sal);
	}
	printf("Employee Records...\n");
	for(i=0;i<5;i++)
	{
		printf("employee Id:%d\n",s[i].id);
		printf("employee Name:%s\n",s[i].name);
		printf("employee salary:%f\n",s[i].sal);
	}
	
}
