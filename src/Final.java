//finally in try-catch block...
public class Final {
    public static void main(String[] args) {
        int i=0;
        String greetings[]={"Hello Twinkle!","Hello Java!","Hello World!"};
        while(i<4){
            try{
                System.out.println(greetings[i]);
                i++;
            }catch(Exception e){
                System.out.println(e.toString());
                //Message of exception e in String formate
            }
            finally{
                System.out.println("Hi!");
                if(i<3);
                else{
                    System.out.println("You should quit and return index value");
                    break;
                }
            }
        }
    }
}
/*
output:
Hello Twinkle!
Hi!
Hello Java!
Hi!
Hello World!
Hi!
You should quit and return index value

 */