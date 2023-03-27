
class Swap5{
int a = 12, b = 41;
public static void main(String args[]){
Swap5 obj = new Swap5();
System.out.println("before swapping = " +obj.a + " " +obj.b);
obj.a = obj.a+obj.b;
obj.b = obj.a-obj.b;
obj.a = obj.a-obj.b;
System.out.println("After swapping = " +obj.a + " " +obj.b);
}
}
