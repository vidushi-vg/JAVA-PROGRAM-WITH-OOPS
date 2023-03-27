import java.util.*;
class Swap2{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();
int b = obj.nextInt();
int c;
System.out.println("before swapping = " + a + " " + b);
c = a;
a = b;
b= c;
System.out.println("After swapping = " + a + " " + b);
}
}