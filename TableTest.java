import java.util.*;
class Table
{
    int no;

    public void setvalue(int n)
    {
        no=n;

    }
    public void ShowTable()
        {    
            for(int i=1;i<=10;i++)
            {
               System.out.println(no*i);
            }
        }
    
}
public class TableTest 
{
  public static void main(String aregs[]) 
  {
      Table T1=new Table();

      System.out.println("Enter the number\n");
     
      Scanner sc=new Scanner(System.in);

      int no=sc.nextInt();

      T1.setvalue(no);
      T1.ShowTable();
    
  }
}
