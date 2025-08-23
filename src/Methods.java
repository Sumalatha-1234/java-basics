public class Methods {
   static int logic( int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=8;
        int b=9;
        int c=logic(a,b);
        System.out.println(c);//85
        int a1=10;
        int b1=5;
        int c1=logic(a1,b1);
        System.out.println(c1);//15
        /*
        if without using the method concept

        int a=5;
        int b=7;
        int c;
        if(a>b){
            c=a+b;
        }else{
            c=(a+b)*5;
        }
        int a1=12;
        int b1=10;
        int c1;
        if(a1>b1){
            c1=a1+b1;
        }else{
            c1=(a1+b1)*5;
        }
        System.out.println(c);//60
        System.out.println(c1);//22
         */
    }
}
