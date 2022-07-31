#include<stdio.h>
int main()
{
    int a[]={2,3,4,5,6};
    printf("%d\n",a[1]);
    acceptPBV(&a[1]);
    printf("%d\n",a[1]);
}
void acceptPBV(int *c)
{
    *(c)=100;
}
void acceptPBR(int b[])
{
    b[1]=30303;
}
void acceptPPBR(int b)
{
    (b)=2020;
}
