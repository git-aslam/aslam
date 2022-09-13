/* 12. Given an array, rotate the array by one position in clock-wise direction.
input : N=5
        A[]={1,2,3,4,5}
output : 5 1 2 3 4
*/

import java.util.Scanner;
public class ArrayRotation{
public static void main(String[]args){

System.out.println("Enter the number of array elements : ");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
int i,j;
System.out.println("Enter the elements : ");
for(i=0;i<n;i++)
a[i]=scan.nextInt();

for(i=0;i<1;i++){
int last=a[n-1];
for(j=n-1;j>0;j--){
a[j]=a[j-1];
}
a[0]=last;
}

System.out.println("Array after rotation : ");
for(i=0;i<n;i++)
System.out.print(a[i]+ " ");
}
}