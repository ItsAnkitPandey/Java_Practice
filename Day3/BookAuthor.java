class Book{
    private int bookId;
    private String bookName;
    private double price;
    private Author author;

    Book(int bookId, String bookName, double price, Author author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }
    

    void display(){
        System.out.println("Book Id: " + bookId);
        System.out.println("Book name: " + bookName);
        System.out.println("Price: " + price);
        System.out.println("Author Details: ");

        author.displayAuthor();
    }
}

class Author{
    private int authorId;
    private String name;
    private String email;

    Author(int authorId, String name, String email){
        this.authorId = authorId;
        this.name = name;
        this.email = email;
    }

    void displayAuthor(){
        System.out.println("AuthorName:" + name);
        System.out.println("Email:" + email);
    }
}

class BookAuthor{
    public static void main(String[] args){
        Author author1 = new Author(111,"Ankit","a@mail.com");

        Book book1 = new Book(101,"Half gf", 765, author1);
        book1.display();

    }
}