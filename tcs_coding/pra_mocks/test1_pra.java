package tcs_coding.pra_mocks;


import java.util.*;




class Book{
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    private int borrowedCount;
    
    //constructor
    Book(int bookId, String title, String author, double price, boolean isAvailable, int borrowedCount) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
        this.borrowedCount = borrowedCount;
    }

    //getters
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public int getBorrowedCount() {
        return borrowedCount;
    }

    //setters
    public void setBookId (int bookId) {
        this.bookId = bookId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    } 
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setBorrowedCount(int borrowedCount) {
        this.borrowedCount = borrowedCount;
    }
}

class Library{
    private String libraryName;
    private int userCount;
    private Book[] books;

    Library(String libraryName, int userCount, Book[] books) {
        this.libraryName = libraryName;
        this.userCount = userCount;
        this.books = books;
    }

    //getters
    public String getLibraryName() {
        return libraryName;
    }
    public int getUserCount() {
        return userCount;
    }
    public Book[] getBooks() {
        return books;
    }

    //setters
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    

}




public class test1_pra {
    public static void findMostBorrowedBookFromEachLibrary(Library[] libraries) {
        System.out.println("Most Borrowed Books from each library are: ");
        for(int i=0 ; i<libraries.length ; i++) {
            Book[] arr = libraries[i].getBooks();
            Book mostBorrowedBook = arr[0];
            for(int j=1 ; j<arr.length ; j++) {
                if(arr[j].getBorrowedCount() > mostBorrowedBook.getBorrowedCount()) {
                    mostBorrowedBook = arr[j];
                }
            }
            System.out.println("Library: " + libraries[i].getLibraryName() + "\nbookId: " + mostBorrowedBook.getBookId() + "\ntitle: " + mostBorrowedBook.getTitle() + "\nauthor: " + mostBorrowedBook.getAuthor() + "\nprice: " + mostBorrowedBook.getPrice() + "\nisAvail: " + mostBorrowedBook.getIsAvailable() + "\nborrowedCount: " + mostBorrowedBook.getBorrowedCount() + "\n" );
        }
    }

    public static void getBooksBelowPrice(Library[] libraries, double maxPrice) {
        System.out.println("Books below price+ "+maxPrice);
        for(int i=0 ; i<libraries.length ; i++) {
            Book[] arr = libraries[i].getBooks();
            for(int j=0 ; j<arr.length ; j++) {
                if(arr[j].getPrice() < maxPrice)
                System.out.println("Library: " + libraries[i].getLibraryName() +  "\nbookId: " + arr[j].getBookId() + "\ntitle: " + arr[j].getTitle() + "\nauthor: " + arr[j].getAuthor() + "\nprice: " + arr[j].getPrice() + "\nisAvail: " + arr[j].getIsAvailable() + "\nborrowedCount: " + arr[j].getBorrowedCount() + "\n" );
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Library[] libraries = new Library[n];
        for(int i=0 ; i<n ; i++) {
            sc.nextLine();
            String libraryName = sc.nextLine();
            int userCount = sc.nextInt();
            int no_of_books = sc.nextInt();
            Book[] book = new Book[no_of_books];

            for(int j=0; j<no_of_books; j++) {
                int bookId = sc.nextInt();
                sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();
                double price = sc.nextDouble();
                boolean isAvailable = sc.nextBoolean();
                int borrowedCount = sc.nextInt();
                book[j] = new Book(bookId, title, author, price, isAvailable, borrowedCount);
            }
            libraries[i] = new Library(libraryName, userCount, book);

        }
        double maxPrice = sc.nextDouble();

        findMostBorrowedBookFromEachLibrary(libraries);
        getBooksBelowPrice(libraries, maxPrice);
        sc.close();

    }    
}
