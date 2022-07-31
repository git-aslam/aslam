#include<stdio.h>
int main()
{
    int a[]={20,30,40,50};
    printf("%d",a[1]);
    acceptPPBR(&a[1]);
    printf("After passing...");
    printf("%d",a[1]);
}
void acceptPBR(int b[])
{
    b[1]=9999;
}
void acceptPPBR(int *b)
{
    *(b)=8888;
}
