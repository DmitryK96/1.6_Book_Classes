public class Book {
    public String title;
    public String author;
    public String genre;
    public int totalPages;

    public Book(String title, String author, String genre, int totalPages){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "Название: " + title + " " + author + ", Жанр: " + genre + " Страниц: " + totalPages;
    }
}
