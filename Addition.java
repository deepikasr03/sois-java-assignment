import java.util.Scanner;

class Addition{
public static void main(String args[]) {
int x,y,z;
System.out.println("enter the numbers to be added");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = x+y;
System.out.println("the sum is="+z);
}
}
