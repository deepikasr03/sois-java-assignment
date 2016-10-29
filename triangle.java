import java.util.Scanner;
class Triangle{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double base=0;
		double height=0;
		double area=0;

System.out.print("enter length of the base :");
base=input.nextDouble();

System.out.print("enter the value for height:");
height=input.nextDouble();

area=(base*height)/2;
System.out.println("the area of the triangle is("+area+")");
}
}

