package tcs_coding;

// import java.io.*;
import java.util.*;

class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    //constructor
    Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName= folderName;
        this.pages = pages;
    }

    //getters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getFolderName() {
        return folderName;
    }
    public int getPages() {
        return pages;
    }
}

public class oddPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Document[] docs = new Document[4];

        for(int i=0 ; i<4 ; i++) {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();

            docs[i] = new Document(id, title, folderName, pages);
        }

        Document[] oddPages = docsWithOddPages(docs);

        for(Document doc: oddPages) {
            System.out.println(doc.getId()+" "+doc.getTitle()+" "+doc.getFolderName()+" "+doc.getPages());
        }

        sc.close();
    }    

    public static Document[] docsWithOddPages(Document[] docs) {
        ArrayList<Document> oddPagesList = new ArrayList<>();
        
        for(Document doc: docs) {
            if(doc.getPages()%2 == 1)
                oddPagesList.add(doc);
        }

        Document[] result = oddPagesList.toArray(new Document[0]);
        Arrays.sort(result,(d1, d2)-> Integer.compare(d1.getId(), d2.getId()));
        return result;
    }
}
