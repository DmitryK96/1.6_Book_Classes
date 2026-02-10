public class Book {
    public static int onlineBook = 0;

    public String title;
    public Author author;
    public String genre;
    public int totalPages;

    public Book(String title, Author author, String genre, int totalPages){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.totalPages = totalPages;

        onlineBook++;
    }

    @Override
    public String toString() {
        return "Название: " + title + " " + author + ", Жанр: " + genre + " Страниц: " + totalPages;
    }
}
