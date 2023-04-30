interface test
{
       void meth1();
       void meth2();
}
class my implements test 
{ 
       public void meth1()
       {
              System.out.println("Meth1 of class my");
       }
       public void meth2()
       {
              System.out.println("Meth2 of class my");
       }
       public void meth3()
       {
              System.out.println("Meth3 of class my");
       }
}
// interfaces are meant for achieving polymorphism
// interface is the collection of abstract method
// interfaces are meant for overiding the abstract method 
public class interfacepractice 
{
    public static void main(String[] args)
    {
       test t=new my();
       t.meth1();
       t.meth2();
    }   
}
