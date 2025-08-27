//Write a function to covert the celsius temperature into farenheite...
public class celFarn {
    static int  CT(int C){
        int F;
        if(C==0) {
            return 32;
        }
        else{
         F=(C*9/5)+32;
        }
        return F;
    }

    public static void main(String[] args) {
        int x=30;
        System.out.println("The result after the conversion is:"+CT(x));
    }
}
