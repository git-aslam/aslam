#include<stdio.h>
int addNumbers(int a, int b);
int main()
{
    int n1, n2, sum;
    printf("Enter two numbers : ");
    scanf("%d %d",&n1,&n2);
    sum=addNumbers(n1,n2);
    return 0;
}
addNumbers(int a, int b)
{
    int result;
    result=a+b;
    printf("Sum = %d",result);
}
