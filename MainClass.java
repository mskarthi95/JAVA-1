

class cat extends Animal{
    public String MakeNoise()
    {
        System.out.println("Meow");
        
    }
     public String walk()
    {
        System.out.println("CAT IS WALKING");
    }

}
class dog extends Animal{
   public String MakeNoise()
    {
        System.out.println("Bark");
    }
    public String walk()
{
    System.out.println("DOG WALKING");
}
}
class MainClass
{
    public static void main(String args[])
    {
        Animal w=new dog(); 
        w.MakeNoise();
    
  }
}