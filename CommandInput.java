public class CommandInput{
public static void main( String args[] ) {
int num=0;
for(int i=0; i<3; i++){
   num+= Integer.parseInt(args[i]);
}

  System.out.println("The sum is " + num);
   }
}