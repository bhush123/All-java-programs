  class Rectangle 
{  
   int length;
   int width;

   public void insertDetails(int l,int w)
   {
       length=l;
       width=w;
   }
   
   public void calculateArea() 
   { 
       System.out.println("Area of rectangle is:"+length*width);
       
   }
}

 public class TestRectangle
 
{
    public static void main(String []args) 
    { 
       Rectangle r1=new Rectangle();
       Rectangle r2=new Rectangle();

       r1.insertDetails(11,5);
       r2.insertDetails(5,8);

       r1.calculateArea();
       r2.calculateArea();

        
    }
}