//Java FileOutputStream:write a byte into a file...
import java.io.*;
public class FileOutput {
    public static void main(String[] args) {
        try{
            File file=new File("first.txt");
            FileOutputStream fout=new FileOutputStream(file);
            fout.write(65);
            fout.write(90);
            fout.close();
            System.out.println("File writing is over..File is created at: "+file.getAbsolutePath());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*output:File writing is over..File is created at: C:\Users\sumal\IdeaProjects\TestProject\first.txt
in the first.txt file the output appeared as AZ
 */