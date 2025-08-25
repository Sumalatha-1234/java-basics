//Run the following program with exception handling mechanism forthe same input...
//Case:try with multiple catch block...
public class withExceptionHandling1 {
    public static void main(String[] args) {
        try{
            int i=args.length;//Number of arguments in the command line..
            String myString[]=new String[i];
            //if i=0 then myString user pointer error..
            if(args[0].equals("Java")){
                System.out.println("First work is Java !");
            }
            System.out.println("No. of arguments:"+i);
            int x=12/i;
            int y[]={555,999};
            y[i]=x;
        }catch(ArithmeticException  e){
            System.out.println("Div by 0:"+e);
        }catch(NullPointerException e){
            System.out.println("A null pointer exception:"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index OOB:"+e);
        }
    }
}
//Array index OOB:java.lang.ArrayIndexOutOfBoundsException:
// Index 0 out of bounds for length 0