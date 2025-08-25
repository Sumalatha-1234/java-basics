//Use of throws clause in exception handling...
import java.lang.*;
public class Throws {
    public static void main(String[] args) throws Exception{
        int[] array=new int[3];
        try{
            for(int i=0;i<4;i++){
                array[i]=i;
            }
            System.out.println(array);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fillIn:"+e.fillInStackTrace());
            System.out.println("Cause:"+e.getCause());
            System.out.println("local:"+e.getLocalizedMessage());
            System.out.println("messa:"+e.getMessage());
            System.out.println("trace:"+e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("trace:");
            e.printStackTrace();
            System.out.println();
            System.out.print("String:"+e.toString());
            System.out.println();
            System.out.println();
            //printed just to inform that we have entered the catch block...
            System.out.println("Oops,we went far,better go back to 0!");
            throw(Exception) new Exception().initCause(e);
        }finally{
            System.out.println(array);
            //Method call to continue program
        }
    }
}
/*
output:
fillIn:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Cause:null
local:Index 3 out of bounds for length 3
messa:Index 3 out of bounds for length 3
trace:[Ljava.lang.StackTraceElement;@8efb846


trace:

String:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

Oops,we went far,better go back to 0!
[I@452b3a41
 */