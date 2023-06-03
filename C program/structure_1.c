#include<stdio.h>
struct emp
{
	int emp_no;
	char ename[20],dept[20];
	float sal;
};
void main()
{
	int cnt=1,i;
	FILE *fp;
	struct emp e;
	fp=fopen("emp.txt","w");
	printf("enter empno,name,dept,sal for 10 emp\n");
	for(i=0;i<3;i++)
	{
		scanf("%d%s%s%f",&e.emp_no,&e.ename,&e.dept,&e.sal);
		fprintf(fp,"Record no:%d\n Employee no:%d\n Employee department:%s\n salary:%f\n",
		cnt,e.emp_no,e.ename,e.dept,e.sal);
		cnt++;
	}
	printf("Record no:%d\n");
	printf("Employee no:%d\n",e.emp_no);
	printf("Employee department:%d\n",e.ename);
	printf("salary:%d\n",sal);
	fclose(fp);
}
