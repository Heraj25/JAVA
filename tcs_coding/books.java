package tcs_coding;

import java.util.*;

class Book{
    private int id;
    private String title;
    private String author;
    private double price;

    //constructor
    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getters
    public int getId() {
        return id;
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

    //setters
}

public class books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Book[] books = new Book[4];

        for(int i=0 ; i<4 ; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine(); 
            double price = sc.nextDouble();

            books[i] = new Book(id, title, author, price);
        }

        Book[] sortedBooks = sortBooksByPrice(books);

        for(Book book: sortedBooks) {
            System.out.println(book.getId()+" "+book.getTitle()+" "+book.getAuthor()+" "+book.getPrice());
        }

        sc.close();
    }

    public static Book[] sortBooksByPrice(Book[] books) {
        Arrays.sort(books, (b1, b2)-> Double.compare(b1.getPrice(), b2.getPrice()));
        return books;
    }
}
