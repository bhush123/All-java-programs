import java.util.*;
class per
{ int m[];
    int per;
  
    void setmarks(int m[])
    {
        this.m=m;
    }

    void calper()
    {
        int agg=0;

        for(int i=0;i<m.length;i++)
        {
            agg=agg+m[i];
        }

        per=agg/6;
        System.out.println("percentage is :"+per);
    }

}


public class calper 
{
    public static void main(String args[])
    {
        per p1=new per();
        
        int a[]=new int[6];
       //int a[]=new int[]{60,90,60,56,85,68};
       System.out.println("enter the marks of subject\n");
       Scanner sc=new Scanner(System.in);
       
       for(int i=0; i<a.length;i++)
       {
           
           a[i]=sc.nextInt();
       }

       p1.setmarks(a);
       p1.calper();

        
    }
}
