#include<stdio.h>
int main()
{
    int i, j, k, rows, space;
    printf("Enter the number of rows : ");
    scanf("%d",&rows);
    for(i=1;i<=rows;i++){
        for(space=1;space<=rows-i;space++){
            printf("  ");
        }
        for(j=1;j<=i;j++){
            printf("%d ",j);
        }
        k=i;
        k++;
        k=k-2;
        for(j=1;j<i;j++){
            printf("%d ",k--);
        }
        printf("\n");
    }
    return 0;
}
