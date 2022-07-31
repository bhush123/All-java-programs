import java.util.*;

class Prime
{
   int no;
   boolean flag=true;
   
   public void setvalue(int no)
   {
       this.no=no;

   }
   public void ShowDetails()
   {   int i=2;
       while(i<no)
       {
           if(no%i==0)
           {
               flag=false;
               break;
           }
           i++;
       }

       if(flag)
       {
           System.out.println("prime number\n");
       }
       else
       {
        System.out.println("Not prime number\n");
       }
       

   }


}


public class PrimeTest 
{
    public static void main(String args[]) 
    {  
        Prime p=new Prime();

       // p.setvalue(6);
       // p.ShowDetails();

       System.out.println("Enter the number\n");

       Scanner sc=new Scanner(System.in);
       int no=sc.nextInt();

       p.setvalue(no);
       p.ShowDetails();


    
        
    }
}
