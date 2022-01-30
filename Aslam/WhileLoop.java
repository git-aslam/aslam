import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n Please Enter any integer value below 10: ");
		number=sc.nextInt();
		while (number<=10)
		{
			sum=sum+number;
			number++;
		}
		System.out.format("sum of the numbers from the While Loop is: %d ",sum);
	}
}
