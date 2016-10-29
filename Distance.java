public class Distance
{
	public static void main(String[] args)
	{
		double x1=2,y1=4,x2=6,y2=3;
		double x=((x2*x2)-2*x2*x1+(x1*x1));
		double y=((y2*y2)-2*y2*y1+(y1*y1));
		double dist=Math.sqrt(x+y);
		System.out.println("Distance between given two points is : "+dist);
	}
} 