//Java FileOutputStream:write a byte into a file...
import java.io.*;
public class ByteFileOutput {
    public static void main(String[] args) {
        byte cities[]={'D','E','L','H','I',' ','M','A','D','R','A','S',' ','L','O','N','D','O','N'};
        FileOutputStream outfile=null;
        //Create an output file Stream..
        try{
            File file=new File("city.txt");
            FileOutputStream fout =new FileOutputStream(file);
            fout.write(cities);
            fout.close();
            System.out.println("File writing is over..File is created at: "+file.getAbsolutePath());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /*
    output:
    File writing is over..File is created at: C:\Users\sumal\IdeaProjects\TestProject\city.txt
int the file city.txt the txt appeared as DELHI MADRAS LONDON
     */
}
