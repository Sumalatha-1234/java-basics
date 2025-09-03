//Copying a file into  another file using characteristic class...
import java.io.*;
public class copFile {
    public static void main(String[] args) {
        //Declare and create input and output files..
        File inFile=new File("input.dat");
        File outFile=new File("output.dat");
        FileReader ins=null;  //creates file Stream ins
        FileWriter outs=null;//creates file stream outs
        //Creates file stream outs
        try{
            ins=new FileReader(inFile);
            //open outFile
            outs=new FileWriter(outFile);
            //open outFile
            int ch;//Read and Write till the end
            while((ch=ins.read())!=-1){
                outs.write(ch);
            }
        }catch(IOException e){
            System.out.println(e);
        }finally{ //close files
            try{
                ins.close();
                outs.close();
            }catch(IOException e){}
        }
    }
}
