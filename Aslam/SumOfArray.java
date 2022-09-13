/* 15. Given an integer array arr of size n, you need to sum the elements of arr. */

import java.util.Scanner;
public class SumOfArray{
public static void main(String[]args){
System.out.println("Enter the number of elements : ");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
int i, sum=0;

System.out.println("Enter the elements : ");
for(i=0;i<n;i++)
a[i]=scan.nextInt();

for(i=0;i<n;i++)
sum+=a[i];
System.out.println("\nsum = "+sum);
}
}