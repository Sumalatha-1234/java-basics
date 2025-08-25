//Multiple errors in a Single catch..
public class multipleError {
    public static int j;

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            try{
                switch(i){
                    case 0:
                        int zero=0;
                        j=999/zero;//Divide by zero
                        break;
                    case 1:
                        int b[]=null;
                        j=b[0];//Null Point error
                    case 2:
                        int c[]=new int[2];
                        j=c[10];//Array index is one of bound..
                        break;
                    case 3:
                        char ch="Java".charAt(9);
                        //String index is out of bound
                        break;
                }
            }catch(Exception e){
                System.out.println("In TestCase#"+i+"\n");
                System.out.println(e.getMessage());
            }
        }
    }
}
/*
output:
In TestCase#0

/ by zero
In TestCase#1

Cannot load from int array because "b" is null
In TestCase#2

Index 10 out of bounds for length 2
In TestCase#3

Index 9 out of bounds for length 4

 */
