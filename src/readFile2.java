//Java FileOutputStream:Reading a text from a file...
import java.io.FileInputStream;
import java.io.IOException;
public class readFile2 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
output:
Welcome to NPTEL! Hope you are enjoying Java Programming
 */