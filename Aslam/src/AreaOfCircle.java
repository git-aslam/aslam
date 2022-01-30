import java.util.Scanner;
class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of Radius : ");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("The Area of a Circle is : "+area);
	}
}
