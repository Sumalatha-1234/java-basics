//Simple program to calculate the rateOfInterest using the DataInputStream....
import java.io.DataInputStream;
public class dataInput {
    public static void main(String[] args) {
        double principalAmount=0.0;
        double rateOfInterest=0.0;
        int numberOfYears=0;
        try{           //anything that might throw an exception goes here...
            DataInputStream in=new DataInputStream(System.in);
            String tempString;  //temporary string to hold what the user types before converting to a number..
            System.out.print("Enter the principalAmount: ");
            System.out.flush(); //forces the prompt to appear immediately
            tempString=in.readLine(); //reads one line from the console as a string..
            principalAmount=Float.valueOf(tempString);
            System.out.print("Enter Rate of Interest: ");
            System.out.flush();
            tempString=in.readLine();
            rateOfInterest=Float.valueOf(tempString);
            System.out.print("Enter number of years: ");
            System.out.flush();
            tempString=in.readLine();
            numberOfYears=Integer.parseInt(tempString);
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        //Input is over:Calculate the interest...
        double interestTotal=principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total interest= "+interestTotal);
    }
}
/*
output:
Enter the principalAmount: 70000
Enter Rate of Interest: 10
Enter number of years: 8
Total interest= 5600000.0
*/