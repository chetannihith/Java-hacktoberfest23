package p1;
public class ex
{
public ex()
{
System.out.println("Created");
}

public void display()
{
System.out.println("Hello");
}
}
import p1.*;
class ex1
{
public static void main(String[] a)
{
ex e=new ex();
e.display();
}
}

