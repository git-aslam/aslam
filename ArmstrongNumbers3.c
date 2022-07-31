#include<math.h>
#include<stdio.h>
int main()
{
    int low, high, num, originalNum, rem, count=0;
    double result=0.0;
    printf("Enter two numbers(intervals): ");
    scanf("%d %d",&low,&high);
    printf("Armstrong numbers between %d and %d are : ",low,high);
    if(high<low){
        high+=low;
        low=high-low;
        high-=low;
    }
    for(num=low+1; num<high; ++num){
        originalNum=num;
        while(originalNum!=0){
            originalNum/=10;
            ++count;
        }
        originalNum=num;
        while(originalNum!=0){
            rem=originalNum%10;
            result+=pow(rem,count);
            originalNum/=10;
        }
        if((int)result==num){
            printf("%d ",num);
        }
        count=0;
        result=0;
    }
    return 0;
}
