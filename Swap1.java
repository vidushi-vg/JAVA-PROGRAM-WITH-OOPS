class Swap1{
int a = 8;
int b = 7;
public static void main(String args[]){
Swap1 obj = new Swap1();
int c;
System.out.println("before swapping = " + obj.a + " " + obj.b);
c = obj.a;
obj.a = obj.b;
obj.b= c;
System.out.println("After swapping = " + obj.a + " " + obj.b);
}
}