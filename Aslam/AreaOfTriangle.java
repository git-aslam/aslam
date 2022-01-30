import java.util.Scanner;
class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the width of a Triangle : ");
		double base=scanner.nextDouble();
		System.out.println("Enter the height of a Triangle : ");
		double height=scanner.nextDouble();
		double area=(base*height)/2;
		System.out.println("Area of a Triangle is : "+area);
	}
}
