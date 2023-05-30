import java.util.*;
public class Main
{


    public static void main(String[] args) {
        int count=0;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n; i++)
        {
            if(n%i==0)      // checking n is divisible by 1,2,3 ....
            {
                count++;        // count no. of zero
            }
        }
        if(count==2)            //if no. of zero is 2 means n is  divisible by 1 and itself called prime no.
        {
            System.out.println("n is  prime no.");
        }
        else
        {
            System.out.println("n is not prime no.");
        }
    }
}
