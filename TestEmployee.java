import java.util.*;
class Employee 
{
      int id;
      int salary;
      String name;

      public void setDetails(int id,String name,int salary) 
      {
          this.id=id;
          this.name=name;
          this.salary=salary;

      }

      public void ShowDetails() 
      {   System.out.println("Display all Data of Employee");
          System.out.println(+id+"\n"+name+"\n"+salary);
      }


}

public class TestEmployee

{ 
    public static void main(String args[])
    {  
        Employee emp=new Employee();

         
        System.out.println("Enter the id,name and salary\n");

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();  
        int  id=sc.nextInt();
        int salary=sc.nextInt();

        emp.setDetails(id, name, salary);

        emp.ShowDetails();


      

    }

}