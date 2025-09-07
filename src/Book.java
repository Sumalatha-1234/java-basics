/*Create a class named Book with the following:
Instance variables: title (String), author (String), and pages (int).
Constructor: A constructor that takes title, author, and pages as parameters.
Inside the constructor, use the this keyword to distinguish
between the instance variables and the constructor parameters.
Method: A public method named displayBookInfo() that prints the book's title, author,
and page count in a formatted string.
main method: In a main method, create a Book object and call the displayBookInfo()
 method to show the output.
 */
public class Book {
    String title;
    String author;
    int pages;
    Book(String title,String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public void displayBookInfo(){
        System.out.println("The title of the book is; "+this.title);
        System.out.println("The author is: "+this.author);
        System.out.println("The number of pages it contains: "+this.pages);
    }

    public static void main(String[] args) {
        Book b = new Book("Bhagvath geetha","Vedha Vyasa",1000);
        b.displayBookInfo();
    }
}
/*
output:
The title of the book is; Bhagvath geetha
The author is: Vedha Vyasa
The number of pages it contains: 1000
 */