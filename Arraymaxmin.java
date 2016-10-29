public class Arraymaxmin
{
    public static void main(String[] args) 
    {
       	int num[]=new int[]{3,44,5,35,3,24,6,65,12,23};
        int min=num[0];
        int max=num[0];
        for(int i=1;i<num.length;i++)
                {
                        if(num[i]>max)
                                max=num[i];
                        else if (num[i]<min)
                                min=num[i];
                       
                }
                System.out.println("the min number in given array is : "+min);
                System.out.println("the max number in given array is : "+max);
    }
}