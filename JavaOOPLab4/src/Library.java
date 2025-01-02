public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        switch (slot){
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
        }
    }

    public void removeBook(int slot){
        switch (slot){
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
        }
    }

    public void printLibraryDetails(){
        System.out.println("Library: " + libraryName);
        if(book1!= null) {
            System.out.println("Book 1: " + book1.title + ", Author: " + book1.author);
        }
        if(book2!= null) {
            System.out.println("Book 2: " + book2.title + ", Author: " + book2.author);
        }
        if(book3!= null) {
            System.out.println("Book 3: " + book3.title + ", Author: " + book3.author);
        }
    }

    public void checkBookAvailability(int slot){
        switch (slot){
            case 1:
                if (book1.isAvailable) {
                    System.out.println(book1.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available.");
                }
                break;
            case 2:
                if (book2.isAvailable) {
                    System.out.println(book2.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available.");
                }
                break;
            case 3:
                if (book3.isAvailable) {
                    System.out.println(book3.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available.");
                }
                break;
        }
    }

    public void updatePrice(int slot, double newPrice){
        switch (slot){
            case 1:
                book1.updatePrice(newPrice);
                break;
            case 2:
                book2.updatePrice(newPrice);
                break;
            case 3:
                book3.updatePrice(newPrice);
                break;
        }
    }

    public void printBookDetails(Book book){
        if (book != null) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.println("Available: " + book.title);
        }
        else {
            System.out.println("No book in this slot.");
        }
    }
}
