class Books{
    String title;
    String author;
    int pages;

    Books(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Books(String title, String author){
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    Books(String title){
        this.title = title;
        this.author = "Unknown";
        this.pages = 0;
    }

    Books(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        
        Books book1 = new Books("Harry Potter", "JK Rowling", 500);
        Books book2 = new Books("Lord of the Rings", "Tolkein");
        Books book3 = new Books("The Hobbit");
        Books book4 = new Books();

        System.out.println(book1.title);
        System.out.println(book2.title);
        System.out.println(book3.title);
        System.out.println(book4.title);
    }
}
