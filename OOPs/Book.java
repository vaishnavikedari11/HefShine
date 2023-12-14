package OOPs;
//create a class book
//get threee attributes-bookname,booktitle,bookauthor,bookId
//create parametrized constructor having the parameter same as that of the instance varible
//create method displaydata -display aal details of the book
//create two objects of the book
public class Book {
    String bookName;
    String bookAuthor;
    int bookId;

    Book(){
        this("xyz","abc",12);
        System.out.println("zero args");
    }

    Book(int abc){
        this();
        System.out.println("one args");
    }
    public Book(String bookName,String bookAuthor,int bookId){
    
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookId=bookId;
    }
    void displayData(){
        System.out.println("BookName = "+bookName);
        System.out.println("BookAuthor = "+bookAuthor);
        System.out.println("BookId = "+bookId);
    }
    public static void main(String[] args) {
        Book b1=new Book("Chhawa", "Shivaji Sawant", 1);
        b1.displayData();
    }
}
