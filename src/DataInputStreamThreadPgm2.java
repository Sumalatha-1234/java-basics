//Reading data from keyboard using DataInputStream class....
import java.io.DataInputStream;
class DataInputStreamThreadPgm2 {
    public static void main(String[] args) {
        double principalAmount = 0.0;
        double rateOfInterest = 0.0;
        int numberOfYears = 0;

        try {
            DataInputStream in = new DataInputStream(System.in);

            System.out.print("Enter principal amount: ");
            String tempString = in.readLine();
            principalAmount = Double.parseDouble(tempString);

            System.out.print("Enter rate of interest: ");
            tempString = in.readLine();
            rateOfInterest = Double.parseDouble(tempString);

            System.out.print("Enter number of years: ");
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            double simpleInterest = (principalAmount * rateOfInterest * numberOfYears) / 100;

            System.out.println("Total Interest = " + simpleInterest);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
/*
output:
Enter principal amount: 10000
Enter rate of interest: 8
Enter number of years: 3
Total Interest = 2400.0
 */