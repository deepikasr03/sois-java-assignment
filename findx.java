public class FindX
{
	public static void main(String[] args)
	{
		double a=2,b=6,c=4;
		
		double temp = Math.sqrt(b * b - 4 * a * c);
 		double X1 = (-b +  temp) / (2*a) ;
        double X2 = (-b -  temp) / (2*a) ;
		System.out.println("The VALUES of X are "+X1+" and "+X2);
 

	}
}