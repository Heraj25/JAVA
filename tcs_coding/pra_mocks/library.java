package tcs_coding.pra_mocks;

import java.util.*;


class Book{
    private int bookId;
    private String title, author;
    private double price;
    private boolean isAvailable;
    private int borrowedCount;

    Book(int bookId, String title, String author, double price, boolean isAvailable, int borrowedCount) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
        this.borrowedCount = borrowedCount;
    }

    //getters
    public int getBookId() { return bookId;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public double getPrice() {return price;}
    public boolean getIsAvailable()  {return isAvailable;}
    public int getBorrowedCount() { return borrowedCount;}


    //setters
    public void setBookId(int bookId) {
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

class libraryDetails {

    String libraryName;
    int userCount;
    Book[] books;
    
    libraryDetails(String libraryName, int userCount, Book[] books) {
        this.libraryName = libraryName;
        this.userCount = userCount;
        this.books = books;
    }
}

public class library{
    public static void findMostBorrowedBookFromEachLibrary(libraryDetails[] libraries) {
        
        
        for(int i=0 ; i<libraries.length ; i++) {
            Book[] arr = libraries[i].books; 
            Book most_bor_book = arr[0];
            for(int j = 0; j<arr.length ; j++) {
                if(arr[j].getBorrowedCount() > most_bor_book.getBorrowedCount()) {
                    // most_bor_book = arr[j];
                    System.out.println(libraries[i].libraryName+" "+most_bor_book.getBookId()+" "+ most_bor_book.getTitle()+ " "+ most_bor_book.getAuthor()+" "+ most_bor_book.getPrice()+" "+most_bor_book.getIsAvailable()+" "+most_bor_book.getBorrowedCount());
                }
            }
            //  System.out.println(libraries[i].libraryName+" "+most_bor_book.getBookId()+" "+ most_bor_book.getTitle()+ " "+ most_bor_book.getAuthor()+" "+ most_bor_book.getPrice()+" "+most_bor_book.getIsAvailable()+" "+most_bor_book.getBorrowedCount());
        }
    }

    public static void getBooksBelowPrice(libraryDetails[] libraries, double maxPrice) {
        for(int i=0 ; i<libraries.length ; i++) {
            Book[] arr = libraries[i].books; 
            Book most_bor_book = arr[0];
            for(int j = 0; j<arr.length ; j++) {
                if(arr[j].getPrice() < maxPrice)  {
                    // most_bor_book = arr[j];
                    System.out.println(libraries[i].libraryName+" "+most_bor_book.getBookId()+" "+ most_bor_book.getTitle()+ " "+ most_bor_book.getAuthor()+" "+ most_bor_book.getPrice()+" "+most_bor_book.getIsAvailable()+" "+most_bor_book.getBorrowedCount());
                }
            }
            // System.out.println(libraries[i].libraryName+" "+most_bor_book.getBookId()+" "+ most_bor_book.getTitle()+ " "+ most_bor_book.getAuthor()+" "+ most_bor_book.getPrice()+" "+most_bor_book.getIsAvailable()+" "+most_bor_book.getBorrowedCount());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        libraryDetails[] libraries = new libraryDetails[n];

        for(int i=0 ; i<n ; i++) {
            String libraryName = sc.nextLine();
            int userCount = sc.nextInt();
            int nb = sc.nextInt();
            Book[] books = new Book[nb];
            for(int j = 0; j<nb ; j++) {
                int bookId = sc.nextInt();
                sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();
                double price = sc.nextDouble();
                boolean isAvailable = sc.nextBoolean();
                int borrowedCount = sc.nextInt();
                sc.nextLine();

                books[j] = new Book(bookId, title, author, price, isAvailable, borrowedCount);
            }
            libraries[i] = new libraryDetails(libraryName, userCount, books);
            sc.close();
        }

        double maxPrice  = sc.nextDouble();

        findMostBorrowedBookFromEachLibrary(libraries);
        getBooksBelowPrice(libraries, maxPrice);
    }
    
}

