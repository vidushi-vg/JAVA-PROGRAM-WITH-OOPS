import java.lang.Math;
class Pythagoras
{
public static void main(String args[]) 
    {
       double h=4, b=3, hyp;          
        hyp= Math.sqrt((h*h)+(b*b));
        System.out.println("The length of the hypotenuse is: " + hyp);
    }
}