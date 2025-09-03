//Java FileInputStream:Reading a single character from a file...
import java.io.FileInputStream;
public class readFile {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=fin.read();
            System.out.print((char)i);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
output:
this program it reads from the file testout.txt and retuns the output as
W
 */
