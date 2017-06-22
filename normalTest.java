class absTest
{
    public void method()
    {
      System.out.println("Abstract");  
    } 
}

class normalTest
{
    public static void main(String args[])
{
    absTest a=new absTest();
    a.method();

}
}