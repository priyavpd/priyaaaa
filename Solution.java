public class Solution
{


    public static void main(String[] args)
    { 
    int sum = 0 ;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    for(int i = 1 ; i <= n; i++)
    {
             for(int j = 1 ; j <= i; j++ )
             {
                sum = sum + j ;
             }
             System.out.println( sum) ;
             sum = 0 ;
    }
    
        


    }
}
