import java.util.Scanner;
class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter Side of a Square : ");
		Scanner scanner=new Scanner(System.in);
		double side=scanner.nextDouble();
		double area=side*side;
		System.out.println("Area of a Square is : "+area);
	}
}
