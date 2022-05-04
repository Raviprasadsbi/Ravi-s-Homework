interface i1
{  void show1();
}
interface i2
{  void show2();
}

class C implements i1,i2
{

        public void show1()
          {
                System.out.println("Show1............");
              }
     public void show2(){
                System.out.println("Show2.......");
                }
}
public class TestInterface
{
	

public static void main(String args[])
{
 C obj=new C();
 obj.show1();
 obj.show2();

}
}
