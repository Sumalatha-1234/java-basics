//Showing run-time error in a program..
public class runTError {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a/b;
        System.out.println("Value of c="+c);
    }
}
/*Note:
Run these program with the following input:
java Error 1 2
java Error 10 20 30
java Error 40
java Error 4.5 5

 */