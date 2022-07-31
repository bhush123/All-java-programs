class Square
{
  int no;

  public void setvalue(int no)
  {
      this.no=no;
  }
  public void ShowSquare()
  {
      System.out.println("Square is :"+no*no);
      
  }

}

public class SquareApp 
{
    public static void main(String []args)
    {  ;
        Square s1=new Square();
         
        s1.setvalue(6);
       // s1.ShowSquare();

        Square s2=s1;

        s2.setvalue(10);
        s1.ShowSquare();
    }
    
}
