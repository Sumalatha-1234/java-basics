//Java FileOutputStream Write a String into a file...
import java.io.FileOutputStream;
public class file1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            String s="Welcome to NPTEL! Hope you are enjoying Java Programming";
            byte b[]=s.getBytes();
            //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File writing is over...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
output:
File writing is over...
and in the file created by the java program above is testout.txt the content printed is
Welcome to NPTEL! Hope you are enjoying Java Programming
 */