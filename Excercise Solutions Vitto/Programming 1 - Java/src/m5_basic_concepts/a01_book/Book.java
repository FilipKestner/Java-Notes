package m5_basic_concepts.a01_book;

public class Book {
    private String author;
    private String title;
    private int pages;
    private boolean onLoan;

    // Constructors
    public Book(String author, String title, int pages, boolean onLoan) {
        setAuthor(author);
        setTitle(title);
        setPages(pages);
        setOnLoan(onLoan);
    }

    public Book() {
        this("unknown", "unknown", 0, false);
    }


    // Getter Setter for every variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    @Override
    public String toString() {
        if (this.onLoan == false) {
            return String.format("Book %s, (%d), written by %s is available.", this.title.toUpperCase(), this.pages, this.author.toUpperCase());
        }
        else {
            return String.format("Book %s (%d), written by %s is on loan.", this.title.toUpperCase(), this.pages, this.author.toUpperCase());
        }

    }


}
