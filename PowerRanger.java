import java.util.*;


interface war
{
    void action();
}
class Ranger1 implements war
{
    public void action()
    {
        System.out.println(" RANK 1");
    }
}
class Ranger2 implements war{
    public void action()
{
    System.out.println("RANK 2");
}
}
class PowerRanger
{
    public static void main(String args[])
    {
        war w =new Ranger1();
        w.action();

    }
}