//Run the following program without exception handling mechanism...
//Case:try with multiple catch block....
public class withoutExceptionHandling1 {
    public static void main(String[] args) {
        int i=args.length;//number of arguments
        String myString[]=new String[i];
        myString[0]=args[0];
        if(myString[0].equals("Java")){
            System.out.println("First word in java!");
        }
        System.out.println("Number of arguments="+i);
        int x=12/i;
        int y[]={555,999};
        y[i]=x;
    }
}
//output:error:Exception(ArrayIndexOutOfBoundsException)