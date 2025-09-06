//Associativity and precedence...
public class Associativity {
    public static void main(String[] args) {
        int a=10,b=5,c=2;
        System.out.println(a+b*c);//Multiplication has higher precedence
        System.out.println((a+b)/c);//parenthesis first
        System.out.println(a+b>>1); //Right shift
        System.out.println(a>b && b>c);//Logical AND
    }
}
/*
output:
20
7
7
true
 */