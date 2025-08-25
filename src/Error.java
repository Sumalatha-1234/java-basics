//Showing compile time erroes in a program..
class  Error {
    public  static void main(String[] args) {
        System.out.println("Can you find errors in me?");
    }
}
class AnotherError{
    public void insert(){
        System.out.println("To insert a text...");
    }
    abstract void delete(){/*AnotherError is not abstract and does not override abstract method delete()
                           in AnotherError
                           */
        System.out.println("To delete a text...");
    }
}
/*Note:
A class file can be compiled successfully,if it is syntactically correct,
even there is n0 main class,that is,with main method..
 */
