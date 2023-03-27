import java.util.*;
class Swap3{
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();
int b = obj.nextInt();
public static void main(String args[]){
Swap3 obj = new Swap3();
int c;
System.out.println("before swapping = " + obj.a + " " + obj.b);
c = obj.a;
obj.a =obj.b;
obj.b= c;
System.out.println("After swapping = " + obj.a + " " + obj.b);
}
}